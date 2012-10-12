package com.fyrecloud.amsler;

import java.net.InetSocketAddress;
import java.nio.ByteOrder;
import java.util.concurrent.Executors;

import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.buffer.HeapChannelBufferFactory;
import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.socket.nio.NioClientSocketChannelFactory;

import android.util.Log;

/**
 *
 * This class is responsible for managing the synchronization communication
 * with the master server.
 *
 * @author Thomas Radloff  fyreman@fyrecloud.com  http://fyrecloud.com/amsler
 *
 */
public class Synchronizer {

	/**
	 * This is the object we use to control the connection to the Master Server.
	 */
	private ClientBootstrap bootstrap;

	/**
	 * We will receive this when we connect.  We will use it later to disconnect.
	 */
	private ChannelFuture connectionChannel;

	/**
	 * Hostname or IP of the Master Server
	 */
	private String hostname;

	/**
	 * The port for the Master Server
	 */
	private int port;

	/**
	 * This is the application/controller
	 */
	private AmslerApplication theApplication;

	/**
	 * When termination of the session with the Master Server is desired, set this
	 * flag to true.  The next incoming packet will cause the handlers to check 
	 * this flag and then terminate before doing anything more.
	 */
	public boolean terminate = false;

	// TODO: javadoc
	public Synchronizer(AmslerApplication a, String hostname, String port) {
		this.theApplication = a;
		this.hostname = hostname;
		this.port     = Integer.parseInt(port);
	}

	// TODO: javadoc
	public void init() {

		// Configure the client.
		bootstrap = new ClientBootstrap(
			new NioClientSocketChannelFactory(
				Executors.newCachedThreadPool(),
				Executors.newCachedThreadPool()
			)
		);

		// Configure the pipeline factory.
		bootstrap.setPipelineFactory(new ReplicationClientPipelineFactory(theApplication));
		bootstrap.setOption( "bufferFactory", new HeapChannelBufferFactory(ByteOrder.LITTLE_ENDIAN ) );

	}

	// TODO: Javadoc
	public void start() {
		// Start the connection attempt.
		Log.i("MySQL","Synchronizer.start");
		connectionChannel = bootstrap.connect(new InetSocketAddress(hostname, port));

		// TODO: Clean this up
		//ChannelFuture future = bootstrap.connect(new InetSocketAddress(host, port));
		//// Wait until the connection attempt succeeds or fails.
		//Channel channel = future.awaitUninterruptibly().getChannel();
		//session.setChannel(channel);
		//if (!future.isSuccess()) {
		//future.getCause().printStackTrace();
		//bootstrap.releaseExternalResources();
		//return;
		//}
	}

	// TODO: Javadoc
	public void stop() {
		// Stop the connection
		Log.i("MySQL","Synchronizer.stop");
		terminate = true;
	}

	// TODO: Javadoc and cleanup
	//public void process(int nextFilePosition) {}
	
}