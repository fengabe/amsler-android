package com.fyrecloud.amsler;

import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;

import static org.jboss.netty.channel.Channels.*;

// TODO where my jdoc!
public class ReplicationClientPipelineFactory implements ChannelPipelineFactory {

	/**
	 * This is the connection to the rest of the app.
	 */
	//private Synchronizer synchronizer;
	// TODO: Get rid of this

	/**
	 * This is the defacto MVC controller for the app.  We need this
	 * in order to communicate with the rest of the app.
	 */
	private AmslerApplication theApplication;

	// TODO: Clean this up
	//public ReplicationClientPipelineFactory(Synchronizer synchronizer) {
	public ReplicationClientPipelineFactory(AmslerApplication a) {
		super();
		this.theApplication = a;
	}

	// TODO: Clean this up
	public ChannelPipeline getPipeline() throws Exception {

		// Create a default pipeline implementation.
		ChannelPipeline pipeline = pipeline();

		// Add the text line codec combination first,
		//pipeline.addLast("framer", new DelimiterBasedFrameDecoder(8192, Delimiters.lineDelimiter()));
		//pipeline.addLast("decoder", new StringDecoder());
		//pipeline.addLast("encoder", new StringEncoder());

		// and then business logic.
		//pipeline.addLast("handler", new TelnetClientHandler());
		pipeline.addLast("decoder", new MySQLFrameDecoder());

		// business logic
		//pipeline.addLast("business_logic", new MySQLClientHandler(synchronizer));
		pipeline.addLast("business_logic", new MySQLClientHandler(theApplication));

		return pipeline;
	}
}