// $ANTLR 3.4 F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g 2012-02-02 09:17:14

  package com.fyrecloud.amsler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MySQLConnectParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AUTO_INCREMENT", "CHARSET", "COLLATE", "COLUMN_NAMES", "CREATE", "DATETIME", "DEFAULT", "DROP", "DelimitedComment", "ENGINE", "EXISTS", "EXPR_LIST", "ID", "IF", "INSERT", "INT", "INTO", "ITG", "KEY", "LOCK", "LPAREN", "LockStmt", "MYISAM", "MYSQL_QUOTED_STRING", "NEWLINE", "NOT", "NULL", "PRIMARY", "QUOTED_STRING", "RPAREN", "SET", "SetStmt", "SingleLineComment", "TABLE", "UNLOCK", "UTF8", "UTF8_UNICODE_CI", "UnlockStmt", "VALUES", "VARCHAR", "WS", "','", "';'", "'='"
    };

    public static final int EOF=-1;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int AUTO_INCREMENT=4;
    public static final int CHARSET=5;
    public static final int COLLATE=6;
    public static final int COLUMN_NAMES=7;
    public static final int CREATE=8;
    public static final int DATETIME=9;
    public static final int DEFAULT=10;
    public static final int DROP=11;
    public static final int DelimitedComment=12;
    public static final int ENGINE=13;
    public static final int EXISTS=14;
    public static final int EXPR_LIST=15;
    public static final int ID=16;
    public static final int IF=17;
    public static final int INSERT=18;
    public static final int INT=19;
    public static final int INTO=20;
    public static final int ITG=21;
    public static final int KEY=22;
    public static final int LOCK=23;
    public static final int LPAREN=24;
    public static final int LockStmt=25;
    public static final int MYISAM=26;
    public static final int MYSQL_QUOTED_STRING=27;
    public static final int NEWLINE=28;
    public static final int NOT=29;
    public static final int NULL=30;
    public static final int PRIMARY=31;
    public static final int QUOTED_STRING=32;
    public static final int RPAREN=33;
    public static final int SET=34;
    public static final int SetStmt=35;
    public static final int SingleLineComment=36;
    public static final int TABLE=37;
    public static final int UNLOCK=38;
    public static final int UTF8=39;
    public static final int UTF8_UNICODE_CI=40;
    public static final int UnlockStmt=41;
    public static final int VALUES=42;
    public static final int VARCHAR=43;
    public static final int WS=44;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public MySQLConnectParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public MySQLConnectParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return MySQLConnectParser.tokenNames; }
    public String getGrammarFileName() { return "F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g"; }


    public static class script_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "script"
    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:21:1: script : ( SingleLineComment | DelimitedComment | create_stmt | drop_stmt | insert_stmt | LockStmt | SetStmt | UnlockStmt )* ;
    public final MySQLConnectParser.script_return script() throws RecognitionException {
        MySQLConnectParser.script_return retval = new MySQLConnectParser.script_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SingleLineComment1=null;
        Token DelimitedComment2=null;
        Token LockStmt6=null;
        Token SetStmt7=null;
        Token UnlockStmt8=null;
        MySQLConnectParser.create_stmt_return create_stmt3 =null;

        MySQLConnectParser.drop_stmt_return drop_stmt4 =null;

        MySQLConnectParser.insert_stmt_return insert_stmt5 =null;


        Object SingleLineComment1_tree=null;
        Object DelimitedComment2_tree=null;
        Object LockStmt6_tree=null;
        Object SetStmt7_tree=null;
        Object UnlockStmt8_tree=null;

        try {
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:21:8: ( ( SingleLineComment | DelimitedComment | create_stmt | drop_stmt | insert_stmt | LockStmt | SetStmt | UnlockStmt )* )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:22:2: ( SingleLineComment | DelimitedComment | create_stmt | drop_stmt | insert_stmt | LockStmt | SetStmt | UnlockStmt )*
            {
            root_0 = (Object)adaptor.nil();


            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:22:2: ( SingleLineComment | DelimitedComment | create_stmt | drop_stmt | insert_stmt | LockStmt | SetStmt | UnlockStmt )*
            loop1:
            do {
                int alt1=9;
                switch ( input.LA(1) ) {
                case SingleLineComment:
                    {
                    alt1=1;
                    }
                    break;
                case DelimitedComment:
                    {
                    alt1=2;
                    }
                    break;
                case CREATE:
                    {
                    alt1=3;
                    }
                    break;
                case DROP:
                    {
                    alt1=4;
                    }
                    break;
                case INSERT:
                    {
                    alt1=5;
                    }
                    break;
                case LockStmt:
                    {
                    alt1=6;
                    }
                    break;
                case SetStmt:
                    {
                    alt1=7;
                    }
                    break;
                case UnlockStmt:
                    {
                    alt1=8;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:22:4: SingleLineComment
            	    {
            	    SingleLineComment1=(Token)match(input,SingleLineComment,FOLLOW_SingleLineComment_in_script45); 
            	    SingleLineComment1_tree = 
            	    (Object)adaptor.create(SingleLineComment1)
            	    ;
            	    adaptor.addChild(root_0, SingleLineComment1_tree);


            	    }
            	    break;
            	case 2 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:23:4: DelimitedComment
            	    {
            	    DelimitedComment2=(Token)match(input,DelimitedComment,FOLLOW_DelimitedComment_in_script50); 
            	    DelimitedComment2_tree = 
            	    (Object)adaptor.create(DelimitedComment2)
            	    ;
            	    adaptor.addChild(root_0, DelimitedComment2_tree);


            	    }
            	    break;
            	case 3 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:24:4: create_stmt
            	    {
            	    pushFollow(FOLLOW_create_stmt_in_script55);
            	    create_stmt3=create_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, create_stmt3.getTree());

            	    }
            	    break;
            	case 4 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:25:4: drop_stmt
            	    {
            	    pushFollow(FOLLOW_drop_stmt_in_script60);
            	    drop_stmt4=drop_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, drop_stmt4.getTree());

            	    }
            	    break;
            	case 5 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:26:4: insert_stmt
            	    {
            	    pushFollow(FOLLOW_insert_stmt_in_script65);
            	    insert_stmt5=insert_stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, insert_stmt5.getTree());

            	    }
            	    break;
            	case 6 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:27:4: LockStmt
            	    {
            	    LockStmt6=(Token)match(input,LockStmt,FOLLOW_LockStmt_in_script70); 
            	    LockStmt6_tree = 
            	    (Object)adaptor.create(LockStmt6)
            	    ;
            	    adaptor.addChild(root_0, LockStmt6_tree);


            	    }
            	    break;
            	case 7 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:28:4: SetStmt
            	    {
            	    SetStmt7=(Token)match(input,SetStmt,FOLLOW_SetStmt_in_script75); 
            	    SetStmt7_tree = 
            	    (Object)adaptor.create(SetStmt7)
            	    ;
            	    adaptor.addChild(root_0, SetStmt7_tree);


            	    }
            	    break;
            	case 8 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:29:4: UnlockStmt
            	    {
            	    UnlockStmt8=(Token)match(input,UnlockStmt,FOLLOW_UnlockStmt_in_script80); 
            	    UnlockStmt8_tree = 
            	    (Object)adaptor.create(UnlockStmt8)
            	    ;
            	    adaptor.addChild(root_0, UnlockStmt8_tree);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "script"


    public static class create_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create_stmt"
    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:37:1: create_stmt : CREATE ^ TABLE table_name '(' create_definition ( ',' create_definition )* ')' table_options ';' ( NEWLINE )* ;
    public final MySQLConnectParser.create_stmt_return create_stmt() throws RecognitionException {
        MySQLConnectParser.create_stmt_return retval = new MySQLConnectParser.create_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token CREATE9=null;
        Token TABLE10=null;
        Token char_literal12=null;
        Token char_literal14=null;
        Token char_literal16=null;
        Token char_literal18=null;
        Token NEWLINE19=null;
        MySQLConnectParser.table_name_return table_name11 =null;

        MySQLConnectParser.create_definition_return create_definition13 =null;

        MySQLConnectParser.create_definition_return create_definition15 =null;

        MySQLConnectParser.table_options_return table_options17 =null;


        Object CREATE9_tree=null;
        Object TABLE10_tree=null;
        Object char_literal12_tree=null;
        Object char_literal14_tree=null;
        Object char_literal16_tree=null;
        Object char_literal18_tree=null;
        Object NEWLINE19_tree=null;

        try {
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:38:2: ( CREATE ^ TABLE table_name '(' create_definition ( ',' create_definition )* ')' table_options ';' ( NEWLINE )* )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:38:4: CREATE ^ TABLE table_name '(' create_definition ( ',' create_definition )* ')' table_options ';' ( NEWLINE )*
            {
            root_0 = (Object)adaptor.nil();


            CREATE9=(Token)match(input,CREATE,FOLLOW_CREATE_in_create_stmt99); 
            CREATE9_tree = 
            (Object)adaptor.create(CREATE9)
            ;
            root_0 = (Object)adaptor.becomeRoot(CREATE9_tree, root_0);


            TABLE10=(Token)match(input,TABLE,FOLLOW_TABLE_in_create_stmt103); 
            TABLE10_tree = 
            (Object)adaptor.create(TABLE10)
            ;
            adaptor.addChild(root_0, TABLE10_tree);


            pushFollow(FOLLOW_table_name_in_create_stmt105);
            table_name11=table_name();

            state._fsp--;

            adaptor.addChild(root_0, table_name11.getTree());

            char_literal12=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_stmt107); 
            char_literal12_tree = 
            (Object)adaptor.create(char_literal12)
            ;
            adaptor.addChild(root_0, char_literal12_tree);


            pushFollow(FOLLOW_create_definition_in_create_stmt109);
            create_definition13=create_definition();

            state._fsp--;

            adaptor.addChild(root_0, create_definition13.getTree());

            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:38:52: ( ',' create_definition )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==45) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:38:53: ',' create_definition
            	    {
            	    char_literal14=(Token)match(input,45,FOLLOW_45_in_create_stmt112); 
            	    char_literal14_tree = 
            	    (Object)adaptor.create(char_literal14)
            	    ;
            	    adaptor.addChild(root_0, char_literal14_tree);


            	    pushFollow(FOLLOW_create_definition_in_create_stmt114);
            	    create_definition15=create_definition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, create_definition15.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            char_literal16=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_stmt118); 
            char_literal16_tree = 
            (Object)adaptor.create(char_literal16)
            ;
            adaptor.addChild(root_0, char_literal16_tree);


            pushFollow(FOLLOW_table_options_in_create_stmt120);
            table_options17=table_options();

            state._fsp--;

            adaptor.addChild(root_0, table_options17.getTree());

            char_literal18=(Token)match(input,46,FOLLOW_46_in_create_stmt124); 
            char_literal18_tree = 
            (Object)adaptor.create(char_literal18)
            ;
            adaptor.addChild(root_0, char_literal18_tree);


            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:38:101: ( NEWLINE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NEWLINE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:38:102: NEWLINE
            	    {
            	    NEWLINE19=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_create_stmt127); 
            	    NEWLINE19_tree = 
            	    (Object)adaptor.create(NEWLINE19)
            	    ;
            	    adaptor.addChild(root_0, NEWLINE19_tree);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "create_stmt"


    public static class drop_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drop_stmt"
    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:40:1: drop_stmt : DROP ^ TABLE ( IF EXISTS )? table_name ';' ( NEWLINE )+ ;
    public final MySQLConnectParser.drop_stmt_return drop_stmt() throws RecognitionException {
        MySQLConnectParser.drop_stmt_return retval = new MySQLConnectParser.drop_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DROP20=null;
        Token TABLE21=null;
        Token IF22=null;
        Token EXISTS23=null;
        Token char_literal25=null;
        Token NEWLINE26=null;
        MySQLConnectParser.table_name_return table_name24 =null;


        Object DROP20_tree=null;
        Object TABLE21_tree=null;
        Object IF22_tree=null;
        Object EXISTS23_tree=null;
        Object char_literal25_tree=null;
        Object NEWLINE26_tree=null;

        try {
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:41:2: ( DROP ^ TABLE ( IF EXISTS )? table_name ';' ( NEWLINE )+ )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:41:4: DROP ^ TABLE ( IF EXISTS )? table_name ';' ( NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();


            DROP20=(Token)match(input,DROP,FOLLOW_DROP_in_drop_stmt139); 
            DROP20_tree = 
            (Object)adaptor.create(DROP20)
            ;
            root_0 = (Object)adaptor.becomeRoot(DROP20_tree, root_0);


            TABLE21=(Token)match(input,TABLE,FOLLOW_TABLE_in_drop_stmt143); 
            TABLE21_tree = 
            (Object)adaptor.create(TABLE21)
            ;
            adaptor.addChild(root_0, TABLE21_tree);


            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:41:17: ( IF EXISTS )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IF) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:41:18: IF EXISTS
                    {
                    IF22=(Token)match(input,IF,FOLLOW_IF_in_drop_stmt146); 
                    IF22_tree = 
                    (Object)adaptor.create(IF22)
                    ;
                    adaptor.addChild(root_0, IF22_tree);


                    EXISTS23=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_drop_stmt148); 
                    EXISTS23_tree = 
                    (Object)adaptor.create(EXISTS23)
                    ;
                    adaptor.addChild(root_0, EXISTS23_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_table_name_in_drop_stmt152);
            table_name24=table_name();

            state._fsp--;

            adaptor.addChild(root_0, table_name24.getTree());

            char_literal25=(Token)match(input,46,FOLLOW_46_in_drop_stmt154); 
            char_literal25_tree = 
            (Object)adaptor.create(char_literal25)
            ;
            adaptor.addChild(root_0, char_literal25_tree);


            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:41:45: ( NEWLINE )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==NEWLINE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:41:45: NEWLINE
            	    {
            	    NEWLINE26=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_drop_stmt156); 
            	    NEWLINE26_tree = 
            	    (Object)adaptor.create(NEWLINE26)
            	    ;
            	    adaptor.addChild(root_0, NEWLINE26_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "drop_stmt"


    public static class insert_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "insert_stmt"
    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:45:1: insert_stmt : INSERT ( INTO )? tname= table_name (cn= column_names )? ( VALUES i+= value_list_item ( ',' i+= value_list_item )* )? ( ';' )? ( NEWLINE )* -> ^( INSERT $tname ( $cn)? ^( VALUES ( $i)+ ) ) ;
    public final MySQLConnectParser.insert_stmt_return insert_stmt() throws RecognitionException {
        MySQLConnectParser.insert_stmt_return retval = new MySQLConnectParser.insert_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INSERT27=null;
        Token INTO28=null;
        Token VALUES29=null;
        Token char_literal30=null;
        Token char_literal31=null;
        Token NEWLINE32=null;
        List list_i=null;
        MySQLConnectParser.table_name_return tname =null;

        MySQLConnectParser.column_names_return cn =null;

        RuleReturnScope i = null;
        Object INSERT27_tree=null;
        Object INTO28_tree=null;
        Object VALUES29_tree=null;
        Object char_literal30_tree=null;
        Object char_literal31_tree=null;
        Object NEWLINE32_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_INSERT=new RewriteRuleTokenStream(adaptor,"token INSERT");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_INTO=new RewriteRuleTokenStream(adaptor,"token INTO");
        RewriteRuleTokenStream stream_VALUES=new RewriteRuleTokenStream(adaptor,"token VALUES");
        RewriteRuleSubtreeStream stream_column_names=new RewriteRuleSubtreeStream(adaptor,"rule column_names");
        RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name");
        RewriteRuleSubtreeStream stream_value_list_item=new RewriteRuleSubtreeStream(adaptor,"rule value_list_item");
        try {
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:46:2: ( INSERT ( INTO )? tname= table_name (cn= column_names )? ( VALUES i+= value_list_item ( ',' i+= value_list_item )* )? ( ';' )? ( NEWLINE )* -> ^( INSERT $tname ( $cn)? ^( VALUES ( $i)+ ) ) )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:46:4: INSERT ( INTO )? tname= table_name (cn= column_names )? ( VALUES i+= value_list_item ( ',' i+= value_list_item )* )? ( ';' )? ( NEWLINE )*
            {
            INSERT27=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert_stmt169);  
            stream_INSERT.add(INSERT27);


            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:46:11: ( INTO )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==INTO) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:46:11: INTO
                    {
                    INTO28=(Token)match(input,INTO,FOLLOW_INTO_in_insert_stmt171);  
                    stream_INTO.add(INTO28);


                    }
                    break;

            }


            pushFollow(FOLLOW_table_name_in_insert_stmt176);
            tname=table_name();

            state._fsp--;

            stream_table_name.add(tname.getTree());

            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:47:6: (cn= column_names )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LPAREN) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:47:6: cn= column_names
                    {
                    pushFollow(FOLLOW_column_names_in_insert_stmt183);
                    cn=column_names();

                    state._fsp--;

                    stream_column_names.add(cn.getTree());

                    }
                    break;

            }


            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:48:4: ( VALUES i+= value_list_item ( ',' i+= value_list_item )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==VALUES) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:48:5: VALUES i+= value_list_item ( ',' i+= value_list_item )*
                    {
                    VALUES29=(Token)match(input,VALUES,FOLLOW_VALUES_in_insert_stmt190);  
                    stream_VALUES.add(VALUES29);


                    pushFollow(FOLLOW_value_list_item_in_insert_stmt194);
                    i=value_list_item();

                    state._fsp--;

                    stream_value_list_item.add(i.getTree());
                    if (list_i==null) list_i=new ArrayList();
                    list_i.add(i.getTree());


                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:48:31: ( ',' i+= value_list_item )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==45) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:48:32: ',' i+= value_list_item
                    	    {
                    	    char_literal30=(Token)match(input,45,FOLLOW_45_in_insert_stmt197);  
                    	    stream_45.add(char_literal30);


                    	    pushFollow(FOLLOW_value_list_item_in_insert_stmt201);
                    	    i=value_list_item();

                    	    state._fsp--;

                    	    stream_value_list_item.add(i.getTree());
                    	    if (list_i==null) list_i=new ArrayList();
                    	    list_i.add(i.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }


            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:49:4: ( ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==46) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:49:4: ';'
                    {
                    char_literal31=(Token)match(input,46,FOLLOW_46_in_insert_stmt210);  
                    stream_46.add(char_literal31);


                    }
                    break;

            }


            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:49:9: ( NEWLINE )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==NEWLINE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:49:9: NEWLINE
            	    {
            	    NEWLINE32=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_insert_stmt213);  
            	    stream_NEWLINE.add(NEWLINE32);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            // AST REWRITE
            // elements: tname, VALUES, i, INSERT, cn
            // token labels: 
            // rule labels: retval, cn, tname
            // token list labels: 
            // rule list labels: i
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_cn=new RewriteRuleSubtreeStream(adaptor,"rule cn",cn!=null?cn.tree:null);
            RewriteRuleSubtreeStream stream_tname=new RewriteRuleSubtreeStream(adaptor,"rule tname",tname!=null?tname.tree:null);
            RewriteRuleSubtreeStream stream_i=new RewriteRuleSubtreeStream(adaptor,"token i",list_i);
            root_0 = (Object)adaptor.nil();
            // 50:2: -> ^( INSERT $tname ( $cn)? ^( VALUES ( $i)+ ) )
            {
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:50:5: ^( INSERT $tname ( $cn)? ^( VALUES ( $i)+ ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_INSERT.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_tname.nextTree());

                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:50:22: ( $cn)?
                if ( stream_cn.hasNext() ) {
                    adaptor.addChild(root_1, stream_cn.nextTree());

                }
                stream_cn.reset();

                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:50:26: ^( VALUES ( $i)+ )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                stream_VALUES.nextNode()
                , root_2);

                if ( !(stream_i.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_i.hasNext() ) {
                    adaptor.addChild(root_2, stream_i.nextTree());

                }
                stream_i.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "insert_stmt"


    public static class collate_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "collate_clause"
    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:56:1: collate_clause : COLLATE collation_name ->;
    public final MySQLConnectParser.collate_clause_return collate_clause() throws RecognitionException {
        MySQLConnectParser.collate_clause_return retval = new MySQLConnectParser.collate_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COLLATE33=null;
        MySQLConnectParser.collation_name_return collation_name34 =null;


        Object COLLATE33_tree=null;
        RewriteRuleTokenStream stream_COLLATE=new RewriteRuleTokenStream(adaptor,"token COLLATE");
        RewriteRuleSubtreeStream stream_collation_name=new RewriteRuleSubtreeStream(adaptor,"rule collation_name");
        try {
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:57:2: ( COLLATE collation_name ->)
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:57:4: COLLATE collation_name
            {
            COLLATE33=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_collate_clause255);  
            stream_COLLATE.add(COLLATE33);


            pushFollow(FOLLOW_collation_name_in_collate_clause257);
            collation_name34=collation_name();

            state._fsp--;

            stream_collation_name.add(collation_name34.getTree());

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 57:27: ->
            {
                root_0 = null;
            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "collate_clause"


    public static class collation_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "collation_name"
    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:60:1: collation_name : UTF8_UNICODE_CI ;
    public final MySQLConnectParser.collation_name_return collation_name() throws RecognitionException {
        MySQLConnectParser.collation_name_return retval = new MySQLConnectParser.collation_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token UTF8_UNICODE_CI35=null;

        Object UTF8_UNICODE_CI35_tree=null;

        try {
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:61:2: ( UTF8_UNICODE_CI )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:61:4: UTF8_UNICODE_CI
            {
            root_0 = (Object)adaptor.nil();


            UTF8_UNICODE_CI35=(Token)match(input,UTF8_UNICODE_CI,FOLLOW_UTF8_UNICODE_CI_in_collation_name275); 
            UTF8_UNICODE_CI35_tree = 
            (Object)adaptor.create(UTF8_UNICODE_CI35)
            ;
            adaptor.addChild(root_0, UTF8_UNICODE_CI35_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "collation_name"


    public static class column_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_definition"
    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:64:1: column_definition : data_type ( null_clause )? ( default_clause )? ( AUTO_INCREMENT !)? ;
    public final MySQLConnectParser.column_definition_return column_definition() throws RecognitionException {
        MySQLConnectParser.column_definition_return retval = new MySQLConnectParser.column_definition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AUTO_INCREMENT39=null;
        MySQLConnectParser.data_type_return data_type36 =null;

        MySQLConnectParser.null_clause_return null_clause37 =null;

        MySQLConnectParser.default_clause_return default_clause38 =null;


        Object AUTO_INCREMENT39_tree=null;

        try {
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:65:2: ( data_type ( null_clause )? ( default_clause )? ( AUTO_INCREMENT !)? )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:65:4: data_type ( null_clause )? ( default_clause )? ( AUTO_INCREMENT !)?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_data_type_in_column_definition286);
            data_type36=data_type();

            state._fsp--;

            adaptor.addChild(root_0, data_type36.getTree());

            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:65:14: ( null_clause )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0 >= NOT && LA12_0 <= NULL)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:65:15: null_clause
                    {
                    pushFollow(FOLLOW_null_clause_in_column_definition289);
                    null_clause37=null_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, null_clause37.getTree());

                    }
                    break;

            }


            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:65:29: ( default_clause )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==DEFAULT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:65:30: default_clause
                    {
                    pushFollow(FOLLOW_default_clause_in_column_definition294);
                    default_clause38=default_clause();

                    state._fsp--;

                    adaptor.addChild(root_0, default_clause38.getTree());

                    }
                    break;

            }


            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:65:61: ( AUTO_INCREMENT !)?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==AUTO_INCREMENT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:65:61: AUTO_INCREMENT !
                    {
                    AUTO_INCREMENT39=(Token)match(input,AUTO_INCREMENT,FOLLOW_AUTO_INCREMENT_in_column_definition298); 

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_definition"


    public static class column_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_name"
    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:68:1: column_name : MYSQL_QUOTED_STRING ;
    public final MySQLConnectParser.column_name_return column_name() throws RecognitionException {
        MySQLConnectParser.column_name_return retval = new MySQLConnectParser.column_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MYSQL_QUOTED_STRING40=null;

        Object MYSQL_QUOTED_STRING40_tree=null;

        try {
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:69:2: ( MYSQL_QUOTED_STRING )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:69:4: MYSQL_QUOTED_STRING
            {
            root_0 = (Object)adaptor.nil();


            MYSQL_QUOTED_STRING40=(Token)match(input,MYSQL_QUOTED_STRING,FOLLOW_MYSQL_QUOTED_STRING_in_column_name311); 
            MYSQL_QUOTED_STRING40_tree = 
            (Object)adaptor.create(MYSQL_QUOTED_STRING40)
            ;
            adaptor.addChild(root_0, MYSQL_QUOTED_STRING40_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_name"


    public static class column_names_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_names"
    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:73:1: column_names : '(' j+= ID ( ',' j+= ID )* ')' -> ^( COLUMN_NAMES ( $j)+ ) ;
    public final MySQLConnectParser.column_names_return column_names() throws RecognitionException {
        MySQLConnectParser.column_names_return retval = new MySQLConnectParser.column_names_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal41=null;
        Token char_literal42=null;
        Token char_literal43=null;
        Token j=null;
        List list_j=null;

        Object char_literal41_tree=null;
        Object char_literal42_tree=null;
        Object char_literal43_tree=null;
        Object j_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");

        try {
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:74:2: ( '(' j+= ID ( ',' j+= ID )* ')' -> ^( COLUMN_NAMES ( $j)+ ) )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:74:4: '(' j+= ID ( ',' j+= ID )* ')'
            {
            char_literal41=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_column_names323);  
            stream_LPAREN.add(char_literal41);


            j=(Token)match(input,ID,FOLLOW_ID_in_column_names327);  
            stream_ID.add(j);

            if (list_j==null) list_j=new ArrayList();
            list_j.add(j);


            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:74:14: ( ',' j+= ID )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==45) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:74:15: ',' j+= ID
            	    {
            	    char_literal42=(Token)match(input,45,FOLLOW_45_in_column_names330);  
            	    stream_45.add(char_literal42);


            	    j=(Token)match(input,ID,FOLLOW_ID_in_column_names334);  
            	    stream_ID.add(j);

            	    if (list_j==null) list_j=new ArrayList();
            	    list_j.add(j);


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            char_literal43=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_column_names338);  
            stream_RPAREN.add(char_literal43);


            // AST REWRITE
            // elements: j
            // token labels: 
            // rule labels: retval
            // token list labels: j
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_j=new RewriteRuleTokenStream(adaptor,"token j", list_j);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 74:31: -> ^( COLUMN_NAMES ( $j)+ )
            {
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:74:34: ^( COLUMN_NAMES ( $j)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(COLUMN_NAMES, "COLUMN_NAMES")
                , root_1);

                if ( !(stream_j.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_j.hasNext() ) {
                    adaptor.addChild(root_1, stream_j.nextNode());

                }
                stream_j.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_names"


    public static class create_definition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "create_definition"
    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:77:1: create_definition : ( column_name column_definition | PRIMARY KEY '(' MYSQL_QUOTED_STRING ')' );
    public final MySQLConnectParser.create_definition_return create_definition() throws RecognitionException {
        MySQLConnectParser.create_definition_return retval = new MySQLConnectParser.create_definition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PRIMARY46=null;
        Token KEY47=null;
        Token char_literal48=null;
        Token MYSQL_QUOTED_STRING49=null;
        Token char_literal50=null;
        MySQLConnectParser.column_name_return column_name44 =null;

        MySQLConnectParser.column_definition_return column_definition45 =null;


        Object PRIMARY46_tree=null;
        Object KEY47_tree=null;
        Object char_literal48_tree=null;
        Object MYSQL_QUOTED_STRING49_tree=null;
        Object char_literal50_tree=null;

        try {
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:78:2: ( column_name column_definition | PRIMARY KEY '(' MYSQL_QUOTED_STRING ')' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==MYSQL_QUOTED_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==PRIMARY) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:78:4: column_name column_definition
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_column_name_in_create_definition359);
                    column_name44=column_name();

                    state._fsp--;

                    adaptor.addChild(root_0, column_name44.getTree());

                    pushFollow(FOLLOW_column_definition_in_create_definition361);
                    column_definition45=column_definition();

                    state._fsp--;

                    adaptor.addChild(root_0, column_definition45.getTree());

                    }
                    break;
                case 2 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:79:4: PRIMARY KEY '(' MYSQL_QUOTED_STRING ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    PRIMARY46=(Token)match(input,PRIMARY,FOLLOW_PRIMARY_in_create_definition366); 
                    PRIMARY46_tree = 
                    (Object)adaptor.create(PRIMARY46)
                    ;
                    adaptor.addChild(root_0, PRIMARY46_tree);


                    KEY47=(Token)match(input,KEY,FOLLOW_KEY_in_create_definition368); 
                    KEY47_tree = 
                    (Object)adaptor.create(KEY47)
                    ;
                    adaptor.addChild(root_0, KEY47_tree);


                    char_literal48=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_create_definition370); 
                    char_literal48_tree = 
                    (Object)adaptor.create(char_literal48)
                    ;
                    adaptor.addChild(root_0, char_literal48_tree);


                    MYSQL_QUOTED_STRING49=(Token)match(input,MYSQL_QUOTED_STRING,FOLLOW_MYSQL_QUOTED_STRING_in_create_definition372); 
                    MYSQL_QUOTED_STRING49_tree = 
                    (Object)adaptor.create(MYSQL_QUOTED_STRING49)
                    ;
                    adaptor.addChild(root_0, MYSQL_QUOTED_STRING49_tree);


                    char_literal50=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_create_definition374); 
                    char_literal50_tree = 
                    (Object)adaptor.create(char_literal50)
                    ;
                    adaptor.addChild(root_0, char_literal50_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "create_definition"


    public static class data_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "data_type"
    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:82:1: data_type : ( DATETIME | INT ( '(' ITG ')' )? | VARCHAR ( '(' ITG ')' )? ( collate_clause )? );
    public final MySQLConnectParser.data_type_return data_type() throws RecognitionException {
        MySQLConnectParser.data_type_return retval = new MySQLConnectParser.data_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DATETIME51=null;
        Token INT52=null;
        Token char_literal53=null;
        Token ITG54=null;
        Token char_literal55=null;
        Token VARCHAR56=null;
        Token char_literal57=null;
        Token ITG58=null;
        Token char_literal59=null;
        MySQLConnectParser.collate_clause_return collate_clause60 =null;


        Object DATETIME51_tree=null;
        Object INT52_tree=null;
        Object char_literal53_tree=null;
        Object ITG54_tree=null;
        Object char_literal55_tree=null;
        Object VARCHAR56_tree=null;
        Object char_literal57_tree=null;
        Object ITG58_tree=null;
        Object char_literal59_tree=null;

        try {
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:83:2: ( DATETIME | INT ( '(' ITG ')' )? | VARCHAR ( '(' ITG ')' )? ( collate_clause )? )
            int alt20=3;
            switch ( input.LA(1) ) {
            case DATETIME:
                {
                alt20=1;
                }
                break;
            case INT:
                {
                alt20=2;
                }
                break;
            case VARCHAR:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:83:4: DATETIME
                    {
                    root_0 = (Object)adaptor.nil();


                    DATETIME51=(Token)match(input,DATETIME,FOLLOW_DATETIME_in_data_type386); 
                    DATETIME51_tree = 
                    (Object)adaptor.create(DATETIME51)
                    ;
                    adaptor.addChild(root_0, DATETIME51_tree);


                    }
                    break;
                case 2 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:84:4: INT ( '(' ITG ')' )?
                    {
                    root_0 = (Object)adaptor.nil();


                    INT52=(Token)match(input,INT,FOLLOW_INT_in_data_type391); 
                    INT52_tree = 
                    (Object)adaptor.create(INT52)
                    ;
                    adaptor.addChild(root_0, INT52_tree);


                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:84:8: ( '(' ITG ')' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==LPAREN) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:84:9: '(' ITG ')'
                            {
                            char_literal53=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_data_type394); 
                            char_literal53_tree = 
                            (Object)adaptor.create(char_literal53)
                            ;
                            adaptor.addChild(root_0, char_literal53_tree);


                            ITG54=(Token)match(input,ITG,FOLLOW_ITG_in_data_type396); 
                            ITG54_tree = 
                            (Object)adaptor.create(ITG54)
                            ;
                            adaptor.addChild(root_0, ITG54_tree);


                            char_literal55=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_data_type398); 
                            char_literal55_tree = 
                            (Object)adaptor.create(char_literal55)
                            ;
                            adaptor.addChild(root_0, char_literal55_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:85:4: VARCHAR ( '(' ITG ')' )? ( collate_clause )?
                    {
                    root_0 = (Object)adaptor.nil();


                    VARCHAR56=(Token)match(input,VARCHAR,FOLLOW_VARCHAR_in_data_type405); 
                    VARCHAR56_tree = 
                    (Object)adaptor.create(VARCHAR56)
                    ;
                    adaptor.addChild(root_0, VARCHAR56_tree);


                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:85:12: ( '(' ITG ')' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==LPAREN) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:85:13: '(' ITG ')'
                            {
                            char_literal57=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_data_type408); 
                            char_literal57_tree = 
                            (Object)adaptor.create(char_literal57)
                            ;
                            adaptor.addChild(root_0, char_literal57_tree);


                            ITG58=(Token)match(input,ITG,FOLLOW_ITG_in_data_type410); 
                            ITG58_tree = 
                            (Object)adaptor.create(ITG58)
                            ;
                            adaptor.addChild(root_0, ITG58_tree);


                            char_literal59=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_data_type412); 
                            char_literal59_tree = 
                            (Object)adaptor.create(char_literal59)
                            ;
                            adaptor.addChild(root_0, char_literal59_tree);


                            }
                            break;

                    }


                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:85:27: ( collate_clause )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==COLLATE) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:85:28: collate_clause
                            {
                            pushFollow(FOLLOW_collate_clause_in_data_type417);
                            collate_clause60=collate_clause();

                            state._fsp--;

                            adaptor.addChild(root_0, collate_clause60.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "data_type"


    public static class default_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "default_clause"
    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:88:1: default_clause : ( DEFAULT QUOTED_STRING | DEFAULT NULL );
    public final MySQLConnectParser.default_clause_return default_clause() throws RecognitionException {
        MySQLConnectParser.default_clause_return retval = new MySQLConnectParser.default_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DEFAULT61=null;
        Token QUOTED_STRING62=null;
        Token DEFAULT63=null;
        Token NULL64=null;

        Object DEFAULT61_tree=null;
        Object QUOTED_STRING62_tree=null;
        Object DEFAULT63_tree=null;
        Object NULL64_tree=null;

        try {
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:89:2: ( DEFAULT QUOTED_STRING | DEFAULT NULL )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==DEFAULT) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==QUOTED_STRING) ) {
                    alt21=1;
                }
                else if ( (LA21_1==NULL) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:89:4: DEFAULT QUOTED_STRING
                    {
                    root_0 = (Object)adaptor.nil();


                    DEFAULT61=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_default_clause430); 
                    DEFAULT61_tree = 
                    (Object)adaptor.create(DEFAULT61)
                    ;
                    adaptor.addChild(root_0, DEFAULT61_tree);


                    QUOTED_STRING62=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_default_clause432); 
                    QUOTED_STRING62_tree = 
                    (Object)adaptor.create(QUOTED_STRING62)
                    ;
                    adaptor.addChild(root_0, QUOTED_STRING62_tree);


                    }
                    break;
                case 2 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:90:4: DEFAULT NULL
                    {
                    root_0 = (Object)adaptor.nil();


                    DEFAULT63=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_default_clause437); 
                    DEFAULT63_tree = 
                    (Object)adaptor.create(DEFAULT63)
                    ;
                    adaptor.addChild(root_0, DEFAULT63_tree);


                    NULL64=(Token)match(input,NULL,FOLLOW_NULL_in_default_clause439); 
                    NULL64_tree = 
                    (Object)adaptor.create(NULL64)
                    ;
                    adaptor.addChild(root_0, NULL64_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "default_clause"


    public static class null_clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "null_clause"
    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:93:1: null_clause : ( NOT )? NULL ;
    public final MySQLConnectParser.null_clause_return null_clause() throws RecognitionException {
        MySQLConnectParser.null_clause_return retval = new MySQLConnectParser.null_clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NOT65=null;
        Token NULL66=null;

        Object NOT65_tree=null;
        Object NULL66_tree=null;

        try {
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:94:3: ( ( NOT )? NULL )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:94:5: ( NOT )? NULL
            {
            root_0 = (Object)adaptor.nil();


            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:94:5: ( NOT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==NOT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:94:5: NOT
                    {
                    NOT65=(Token)match(input,NOT,FOLLOW_NOT_in_null_clause451); 
                    NOT65_tree = 
                    (Object)adaptor.create(NOT65)
                    ;
                    adaptor.addChild(root_0, NOT65_tree);


                    }
                    break;

            }


            NULL66=(Token)match(input,NULL,FOLLOW_NULL_in_null_clause454); 
            NULL66_tree = 
            (Object)adaptor.create(NULL66)
            ;
            adaptor.addChild(root_0, NULL66_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "null_clause"


    public static class table_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_name"
    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:97:1: table_name : ( MYSQL_QUOTED_STRING | ID );
    public final MySQLConnectParser.table_name_return table_name() throws RecognitionException {
        MySQLConnectParser.table_name_return retval = new MySQLConnectParser.table_name_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set67=null;

        Object set67_tree=null;

        try {
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:98:2: ( MYSQL_QUOTED_STRING | ID )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:
            {
            root_0 = (Object)adaptor.nil();


            set67=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==MYSQL_QUOTED_STRING ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set67)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_name"


    public static class table_options_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_options"
    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:102:1: table_options : ( table_option )* ;
    public final MySQLConnectParser.table_options_return table_options() throws RecognitionException {
        MySQLConnectParser.table_options_return retval = new MySQLConnectParser.table_options_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MySQLConnectParser.table_option_return table_option68 =null;



        try {
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:103:2: ( ( table_option )* )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:103:4: ( table_option )*
            {
            root_0 = (Object)adaptor.nil();


            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:103:4: ( table_option )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==AUTO_INCREMENT||LA23_0==COLLATE||LA23_0==DEFAULT||LA23_0==ENGINE) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:103:4: table_option
            	    {
            	    pushFollow(FOLLOW_table_option_in_table_options482);
            	    table_option68=table_option();

            	    state._fsp--;

            	    adaptor.addChild(root_0, table_option68.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_options"


    public static class table_option_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_option"
    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:106:1: table_option : ( ( AUTO_INCREMENT '=' ITG ) ->| ( DEFAULT CHARSET '=' UTF8 ) ->| ( COLLATE '=' UTF8_UNICODE_CI ) ->| ( ENGINE '=' MYISAM ) ->);
    public final MySQLConnectParser.table_option_return table_option() throws RecognitionException {
        MySQLConnectParser.table_option_return retval = new MySQLConnectParser.table_option_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AUTO_INCREMENT69=null;
        Token char_literal70=null;
        Token ITG71=null;
        Token DEFAULT72=null;
        Token CHARSET73=null;
        Token char_literal74=null;
        Token UTF875=null;
        Token COLLATE76=null;
        Token char_literal77=null;
        Token UTF8_UNICODE_CI78=null;
        Token ENGINE79=null;
        Token char_literal80=null;
        Token MYISAM81=null;

        Object AUTO_INCREMENT69_tree=null;
        Object char_literal70_tree=null;
        Object ITG71_tree=null;
        Object DEFAULT72_tree=null;
        Object CHARSET73_tree=null;
        Object char_literal74_tree=null;
        Object UTF875_tree=null;
        Object COLLATE76_tree=null;
        Object char_literal77_tree=null;
        Object UTF8_UNICODE_CI78_tree=null;
        Object ENGINE79_tree=null;
        Object char_literal80_tree=null;
        Object MYISAM81_tree=null;
        RewriteRuleTokenStream stream_AUTO_INCREMENT=new RewriteRuleTokenStream(adaptor,"token AUTO_INCREMENT");
        RewriteRuleTokenStream stream_ITG=new RewriteRuleTokenStream(adaptor,"token ITG");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_CHARSET=new RewriteRuleTokenStream(adaptor,"token CHARSET");
        RewriteRuleTokenStream stream_UTF8=new RewriteRuleTokenStream(adaptor,"token UTF8");
        RewriteRuleTokenStream stream_ENGINE=new RewriteRuleTokenStream(adaptor,"token ENGINE");
        RewriteRuleTokenStream stream_MYISAM=new RewriteRuleTokenStream(adaptor,"token MYISAM");
        RewriteRuleTokenStream stream_UTF8_UNICODE_CI=new RewriteRuleTokenStream(adaptor,"token UTF8_UNICODE_CI");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_COLLATE=new RewriteRuleTokenStream(adaptor,"token COLLATE");

        try {
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:107:2: ( ( AUTO_INCREMENT '=' ITG ) ->| ( DEFAULT CHARSET '=' UTF8 ) ->| ( COLLATE '=' UTF8_UNICODE_CI ) ->| ( ENGINE '=' MYISAM ) ->)
            int alt24=4;
            switch ( input.LA(1) ) {
            case AUTO_INCREMENT:
                {
                alt24=1;
                }
                break;
            case DEFAULT:
                {
                alt24=2;
                }
                break;
            case COLLATE:
                {
                alt24=3;
                }
                break;
            case ENGINE:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:107:4: ( AUTO_INCREMENT '=' ITG )
                    {
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:107:4: ( AUTO_INCREMENT '=' ITG )
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:107:5: AUTO_INCREMENT '=' ITG
                    {
                    AUTO_INCREMENT69=(Token)match(input,AUTO_INCREMENT,FOLLOW_AUTO_INCREMENT_in_table_option495);  
                    stream_AUTO_INCREMENT.add(AUTO_INCREMENT69);


                    char_literal70=(Token)match(input,47,FOLLOW_47_in_table_option497);  
                    stream_47.add(char_literal70);


                    ITG71=(Token)match(input,ITG,FOLLOW_ITG_in_table_option499);  
                    stream_ITG.add(ITG71);


                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 107:30: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:108:4: ( DEFAULT CHARSET '=' UTF8 )
                    {
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:108:4: ( DEFAULT CHARSET '=' UTF8 )
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:108:5: DEFAULT CHARSET '=' UTF8
                    {
                    DEFAULT72=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_table_option513);  
                    stream_DEFAULT.add(DEFAULT72);


                    CHARSET73=(Token)match(input,CHARSET,FOLLOW_CHARSET_in_table_option515);  
                    stream_CHARSET.add(CHARSET73);


                    char_literal74=(Token)match(input,47,FOLLOW_47_in_table_option517);  
                    stream_47.add(char_literal74);


                    UTF875=(Token)match(input,UTF8,FOLLOW_UTF8_in_table_option519);  
                    stream_UTF8.add(UTF875);


                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 108:31: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:109:4: ( COLLATE '=' UTF8_UNICODE_CI )
                    {
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:109:4: ( COLLATE '=' UTF8_UNICODE_CI )
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:109:5: COLLATE '=' UTF8_UNICODE_CI
                    {
                    COLLATE76=(Token)match(input,COLLATE,FOLLOW_COLLATE_in_table_option531);  
                    stream_COLLATE.add(COLLATE76);


                    char_literal77=(Token)match(input,47,FOLLOW_47_in_table_option533);  
                    stream_47.add(char_literal77);


                    UTF8_UNICODE_CI78=(Token)match(input,UTF8_UNICODE_CI,FOLLOW_UTF8_UNICODE_CI_in_table_option535);  
                    stream_UTF8_UNICODE_CI.add(UTF8_UNICODE_CI78);


                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 109:34: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:110:4: ( ENGINE '=' MYISAM )
                    {
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:110:4: ( ENGINE '=' MYISAM )
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:110:5: ENGINE '=' MYISAM
                    {
                    ENGINE79=(Token)match(input,ENGINE,FOLLOW_ENGINE_in_table_option546);  
                    stream_ENGINE.add(ENGINE79);


                    char_literal80=(Token)match(input,47,FOLLOW_47_in_table_option548);  
                    stream_47.add(char_literal80);


                    MYISAM81=(Token)match(input,MYISAM,FOLLOW_MYISAM_in_table_option550);  
                    stream_MYISAM.add(MYISAM81);


                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 110:24: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_option"


    public static class value_list_item_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value_list_item"
    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:113:1: value_list_item : LPAREN i+= expr ( ',' i+= expr )* RPAREN -> ^( EXPR_LIST ( $i)+ ) ;
    public final MySQLConnectParser.value_list_item_return value_list_item() throws RecognitionException {
        MySQLConnectParser.value_list_item_return retval = new MySQLConnectParser.value_list_item_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LPAREN82=null;
        Token char_literal83=null;
        Token RPAREN84=null;
        List list_i=null;
        RuleReturnScope i = null;
        Object LPAREN82_tree=null;
        Object char_literal83_tree=null;
        Object RPAREN84_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:114:2: ( LPAREN i+= expr ( ',' i+= expr )* RPAREN -> ^( EXPR_LIST ( $i)+ ) )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:114:4: LPAREN i+= expr ( ',' i+= expr )* RPAREN
            {
            LPAREN82=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value_list_item570);  
            stream_LPAREN.add(LPAREN82);


            pushFollow(FOLLOW_expr_in_value_list_item574);
            i=expr();

            state._fsp--;

            stream_expr.add(i.getTree());
            if (list_i==null) list_i=new ArrayList();
            list_i.add(i.getTree());


            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:114:19: ( ',' i+= expr )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==45) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:114:20: ',' i+= expr
            	    {
            	    char_literal83=(Token)match(input,45,FOLLOW_45_in_value_list_item577);  
            	    stream_45.add(char_literal83);


            	    pushFollow(FOLLOW_expr_in_value_list_item581);
            	    i=expr();

            	    state._fsp--;

            	    stream_expr.add(i.getTree());
            	    if (list_i==null) list_i=new ArrayList();
            	    list_i.add(i.getTree());


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            RPAREN84=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value_list_item585);  
            stream_RPAREN.add(RPAREN84);


            // AST REWRITE
            // elements: i
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: i
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_i=new RewriteRuleSubtreeStream(adaptor,"token i",list_i);
            root_0 = (Object)adaptor.nil();
            // 114:41: -> ^( EXPR_LIST ( $i)+ )
            {
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:114:44: ^( EXPR_LIST ( $i)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(EXPR_LIST, "EXPR_LIST")
                , root_1);

                if ( !(stream_i.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_i.hasNext() ) {
                    adaptor.addChild(root_1, stream_i.nextTree());

                }
                stream_i.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "value_list_item"


    public static class expr_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_list"
    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:117:1: expr_list : expr ( ',' expr )* -> ( expr )+ ;
    public final MySQLConnectParser.expr_list_return expr_list() throws RecognitionException {
        MySQLConnectParser.expr_list_return retval = new MySQLConnectParser.expr_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal86=null;
        MySQLConnectParser.expr_return expr85 =null;

        MySQLConnectParser.expr_return expr87 =null;


        Object char_literal86_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:118:2: ( expr ( ',' expr )* -> ( expr )+ )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:118:4: expr ( ',' expr )*
            {
            pushFollow(FOLLOW_expr_in_expr_list606);
            expr85=expr();

            state._fsp--;

            stream_expr.add(expr85.getTree());

            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:118:9: ( ',' expr )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==45) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:118:10: ',' expr
            	    {
            	    char_literal86=(Token)match(input,45,FOLLOW_45_in_expr_list609);  
            	    stream_45.add(char_literal86);


            	    pushFollow(FOLLOW_expr_in_expr_list611);
            	    expr87=expr();

            	    state._fsp--;

            	    stream_expr.add(expr87.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 118:21: -> ( expr )+
            {
                if ( !(stream_expr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_0, stream_expr.nextTree());

                }
                stream_expr.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_list"


    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:128:1: expr : ( ITG | QUOTED_STRING );
    public final MySQLConnectParser.expr_return expr() throws RecognitionException {
        MySQLConnectParser.expr_return retval = new MySQLConnectParser.expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set88=null;

        Object set88_tree=null;

        try {
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:128:6: ( ITG | QUOTED_STRING )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:
            {
            root_0 = (Object)adaptor.nil();


            set88=(Token)input.LT(1);

            if ( input.LA(1)==ITG||input.LA(1)==QUOTED_STRING ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set88)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"

    // Delegated rules


 

    public static final BitSet FOLLOW_SingleLineComment_in_script45 = new BitSet(new long[]{0x0000021802041902L});
    public static final BitSet FOLLOW_DelimitedComment_in_script50 = new BitSet(new long[]{0x0000021802041902L});
    public static final BitSet FOLLOW_create_stmt_in_script55 = new BitSet(new long[]{0x0000021802041902L});
    public static final BitSet FOLLOW_drop_stmt_in_script60 = new BitSet(new long[]{0x0000021802041902L});
    public static final BitSet FOLLOW_insert_stmt_in_script65 = new BitSet(new long[]{0x0000021802041902L});
    public static final BitSet FOLLOW_LockStmt_in_script70 = new BitSet(new long[]{0x0000021802041902L});
    public static final BitSet FOLLOW_SetStmt_in_script75 = new BitSet(new long[]{0x0000021802041902L});
    public static final BitSet FOLLOW_UnlockStmt_in_script80 = new BitSet(new long[]{0x0000021802041902L});
    public static final BitSet FOLLOW_CREATE_in_create_stmt99 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_TABLE_in_create_stmt103 = new BitSet(new long[]{0x0000000008010000L});
    public static final BitSet FOLLOW_table_name_in_create_stmt105 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_create_stmt107 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_create_definition_in_create_stmt109 = new BitSet(new long[]{0x0000200200000000L});
    public static final BitSet FOLLOW_45_in_create_stmt112 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_create_definition_in_create_stmt114 = new BitSet(new long[]{0x0000200200000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_stmt118 = new BitSet(new long[]{0x0000400000002450L});
    public static final BitSet FOLLOW_table_options_in_create_stmt120 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_create_stmt124 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_NEWLINE_in_create_stmt127 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_DROP_in_drop_stmt139 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_TABLE_in_drop_stmt143 = new BitSet(new long[]{0x0000000008030000L});
    public static final BitSet FOLLOW_IF_in_drop_stmt146 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_EXISTS_in_drop_stmt148 = new BitSet(new long[]{0x0000000008010000L});
    public static final BitSet FOLLOW_table_name_in_drop_stmt152 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_drop_stmt154 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_NEWLINE_in_drop_stmt156 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_INSERT_in_insert_stmt169 = new BitSet(new long[]{0x0000000008110000L});
    public static final BitSet FOLLOW_INTO_in_insert_stmt171 = new BitSet(new long[]{0x0000000008010000L});
    public static final BitSet FOLLOW_table_name_in_insert_stmt176 = new BitSet(new long[]{0x0000440011000002L});
    public static final BitSet FOLLOW_column_names_in_insert_stmt183 = new BitSet(new long[]{0x0000440010000002L});
    public static final BitSet FOLLOW_VALUES_in_insert_stmt190 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_value_list_item_in_insert_stmt194 = new BitSet(new long[]{0x0000600010000002L});
    public static final BitSet FOLLOW_45_in_insert_stmt197 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_value_list_item_in_insert_stmt201 = new BitSet(new long[]{0x0000600010000002L});
    public static final BitSet FOLLOW_46_in_insert_stmt210 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_NEWLINE_in_insert_stmt213 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_COLLATE_in_collate_clause255 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_collation_name_in_collate_clause257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UTF8_UNICODE_CI_in_collation_name275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_type_in_column_definition286 = new BitSet(new long[]{0x0000000060000412L});
    public static final BitSet FOLLOW_null_clause_in_column_definition289 = new BitSet(new long[]{0x0000000000000412L});
    public static final BitSet FOLLOW_default_clause_in_column_definition294 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AUTO_INCREMENT_in_column_definition298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MYSQL_QUOTED_STRING_in_column_name311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_column_names323 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_column_names327 = new BitSet(new long[]{0x0000200200000000L});
    public static final BitSet FOLLOW_45_in_column_names330 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_column_names334 = new BitSet(new long[]{0x0000200200000000L});
    public static final BitSet FOLLOW_RPAREN_in_column_names338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_in_create_definition359 = new BitSet(new long[]{0x0000080000080200L});
    public static final BitSet FOLLOW_column_definition_in_create_definition361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMARY_in_create_definition366 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_KEY_in_create_definition368 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_create_definition370 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_MYSQL_QUOTED_STRING_in_create_definition372 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RPAREN_in_create_definition374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATETIME_in_data_type386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_data_type391 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_LPAREN_in_data_type394 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ITG_in_data_type396 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RPAREN_in_data_type398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARCHAR_in_data_type405 = new BitSet(new long[]{0x0000000001000042L});
    public static final BitSet FOLLOW_LPAREN_in_data_type408 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ITG_in_data_type410 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RPAREN_in_data_type412 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_collate_clause_in_data_type417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_default_clause430 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_default_clause432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_default_clause437 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_NULL_in_default_clause439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_null_clause451 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_NULL_in_null_clause454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_option_in_table_options482 = new BitSet(new long[]{0x0000000000002452L});
    public static final BitSet FOLLOW_AUTO_INCREMENT_in_table_option495 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_table_option497 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ITG_in_table_option499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_table_option513 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_CHARSET_in_table_option515 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_table_option517 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_UTF8_in_table_option519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLATE_in_table_option531 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_table_option533 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_UTF8_UNICODE_CI_in_table_option535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENGINE_in_table_option546 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_table_option548 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_MYISAM_in_table_option550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value_list_item570 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_expr_in_value_list_item574 = new BitSet(new long[]{0x0000200200000000L});
    public static final BitSet FOLLOW_45_in_value_list_item577 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_expr_in_value_list_item581 = new BitSet(new long[]{0x0000200200000000L});
    public static final BitSet FOLLOW_RPAREN_in_value_list_item585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list606 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_expr_list609 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_expr_in_expr_list611 = new BitSet(new long[]{0x0000200000000002L});

}