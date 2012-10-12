package com.fyrecloud.amsler;

// $ANTLR 3.4 F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g 2012-02-02 09:17:14

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MySQLConnectLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MySQLConnectLexer() {} 
    public MySQLConnectLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MySQLConnectLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g"; }

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:2:7: ( ',' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:2:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:3:7: ( ';' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:3:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:4:7: ( '=' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:4:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "AUTO_INCREMENT"
    public final void mAUTO_INCREMENT() throws RecognitionException {
        try {
            int _type = AUTO_INCREMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:139:2: ( 'AUTO_INCREMENT' | 'auto_increment' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='A') ) {
                alt1=1;
            }
            else if ( (LA1_0=='a') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:139:4: 'AUTO_INCREMENT'
                    {
                    match("AUTO_INCREMENT"); 



                    }
                    break;
                case 2 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:139:23: 'auto_increment'
                    {
                    match("auto_increment"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AUTO_INCREMENT"

    // $ANTLR start "CHARSET"
    public final void mCHARSET() throws RecognitionException {
        try {
            int _type = CHARSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:141:9: ( 'CHARSET' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:141:11: 'CHARSET'
            {
            match("CHARSET"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARSET"

    // $ANTLR start "COLLATE"
    public final void mCOLLATE() throws RecognitionException {
        try {
            int _type = COLLATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:142:9: ( 'COLLATE' | 'collate' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='C') ) {
                alt2=1;
            }
            else if ( (LA2_0=='c') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:142:11: 'COLLATE'
                    {
                    match("COLLATE"); 



                    }
                    break;
                case 2 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:142:23: 'collate'
                    {
                    match("collate"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLLATE"

    // $ANTLR start "COLUMN_NAMES"
    public final void mCOLUMN_NAMES() throws RecognitionException {
        try {
            int _type = COLUMN_NAMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:145:2: ( 'COLUMN_NAMES' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:145:4: 'COLUMN_NAMES'
            {
            match("COLUMN_NAMES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLUMN_NAMES"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:147:9: ( 'CREATE' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:147:11: 'CREATE'
            {
            match("CREATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "DATETIME"
    public final void mDATETIME() throws RecognitionException {
        try {
            int _type = DATETIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:150:2: ( 'DATETIME' | 'datetime' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='D') ) {
                alt3=1;
            }
            else if ( (LA3_0=='d') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:150:4: 'DATETIME'
                    {
                    match("DATETIME"); 



                    }
                    break;
                case 2 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:150:17: 'datetime'
                    {
                    match("datetime"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DATETIME"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:152:9: ( 'DEFAULT' | 'default' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='D') ) {
                alt4=1;
            }
            else if ( (LA4_0=='d') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:152:11: 'DEFAULT'
                    {
                    match("DEFAULT"); 



                    }
                    break;
                case 2 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:152:23: 'default'
                    {
                    match("default"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "DROP"
    public final void mDROP() throws RecognitionException {
        try {
            int _type = DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:153:6: ( 'DROP' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:153:8: 'DROP'
            {
            match("DROP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DROP"

    // $ANTLR start "ENGINE"
    public final void mENGINE() throws RecognitionException {
        try {
            int _type = ENGINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:154:9: ( 'ENGINE' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:154:11: 'ENGINE'
            {
            match("ENGINE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENGINE"

    // $ANTLR start "EXISTS"
    public final void mEXISTS() throws RecognitionException {
        try {
            int _type = EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:155:9: ( 'EXISTS' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:155:11: 'EXISTS'
            {
            match("EXISTS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXISTS"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:156:4: ( 'IF' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:156:6: 'IF'
            {
            match("IF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "INSERT"
    public final void mINSERT() throws RecognitionException {
        try {
            int _type = INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:157:9: ( 'INSERT' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:157:11: 'INSERT'
            {
            match("INSERT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INSERT"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:158:5: ( 'INT' | 'int' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='I') ) {
                alt5=1;
            }
            else if ( (LA5_0=='i') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:158:7: 'INT'
                    {
                    match("INT"); 



                    }
                    break;
                case 2 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:158:15: 'int'
                    {
                    match("int"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:159:6: ( 'INTO' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:159:8: 'INTO'
            {
            match("INTO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTO"

    // $ANTLR start "KEY"
    public final void mKEY() throws RecognitionException {
        try {
            int _type = KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:160:5: ( 'KEY' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:160:7: 'KEY'
            {
            match("KEY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEY"

    // $ANTLR start "LOCK"
    public final void mLOCK() throws RecognitionException {
        try {
            int _type = LOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:161:6: ( 'LOCK' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:161:8: 'LOCK'
            {
            match("LOCK"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOCK"

    // $ANTLR start "MYISAM"
    public final void mMYISAM() throws RecognitionException {
        try {
            int _type = MYISAM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:162:8: ( 'MyISAM' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:162:10: 'MyISAM'
            {
            match("MyISAM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MYISAM"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:163:5: ( 'NOT' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:163:7: 'NOT'
            {
            match("NOT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:164:6: ( 'NULL' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:164:8: 'NULL'
            {
            match("NULL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "PRIMARY"
    public final void mPRIMARY() throws RecognitionException {
        try {
            int _type = PRIMARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:165:9: ( 'PRIMARY' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:165:11: 'PRIMARY'
            {
            match("PRIMARY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRIMARY"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:166:5: ( 'SET' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:166:7: 'SET'
            {
            match("SET"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "TABLE"
    public final void mTABLE() throws RecognitionException {
        try {
            int _type = TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:167:7: ( 'TABLE' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:167:9: 'TABLE'
            {
            match("TABLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TABLE"

    // $ANTLR start "UNLOCK"
    public final void mUNLOCK() throws RecognitionException {
        try {
            int _type = UNLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:168:8: ( 'UNLOCK' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:168:10: 'UNLOCK'
            {
            match("UNLOCK"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNLOCK"

    // $ANTLR start "UTF8"
    public final void mUTF8() throws RecognitionException {
        try {
            int _type = UTF8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:169:6: ( 'utf8' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:169:8: 'utf8'
            {
            match("utf8"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UTF8"

    // $ANTLR start "UTF8_UNICODE_CI"
    public final void mUTF8_UNICODE_CI() throws RecognitionException {
        try {
            int _type = UTF8_UNICODE_CI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:172:2: ( 'utf8_unicode_ci' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:172:4: 'utf8_unicode_ci'
            {
            match("utf8_unicode_ci"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UTF8_UNICODE_CI"

    // $ANTLR start "VALUES"
    public final void mVALUES() throws RecognitionException {
        try {
            int _type = VALUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:174:9: ( 'VALUES' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:174:11: 'VALUES'
            {
            match("VALUES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VALUES"

    // $ANTLR start "VARCHAR"
    public final void mVARCHAR() throws RecognitionException {
        try {
            int _type = VARCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:175:9: ( 'VARCHAR' | 'varchar' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='V') ) {
                alt6=1;
            }
            else if ( (LA6_0=='v') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:175:11: 'VARCHAR'
                    {
                    match("VARCHAR"); 



                    }
                    break;
                case 2 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:175:23: 'varchar'
                    {
                    match("varchar"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VARCHAR"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:178:9: ( '(' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:178:11: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:179:9: ( ')' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:179:11: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "EXPR_LIST"
    public final void mEXPR_LIST() throws RecognitionException {
        try {
            int _type = EXPR_LIST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:181:3: ( 'EXPR_LIST' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:181:5: 'EXPR_LIST'
            {
            match("EXPR_LIST"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPR_LIST"

    // $ANTLR start "SingleLineComment"
    public final void mSingleLineComment() throws RecognitionException {
        try {
            int _type = SingleLineComment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:186:3: ( '--' (~ ( '\\r' | '\\n' ) )* ( NEWLINE )* )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:186:5: '--' (~ ( '\\r' | '\\n' ) )* ( NEWLINE )*
            {
            match("--"); 



            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:186:10: (~ ( '\\r' | '\\n' ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:186:30: ( NEWLINE )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:186:32: NEWLINE
            	    {
            	    mNEWLINE(); 


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SingleLineComment"

    // $ANTLR start "DelimitedComment"
    public final void mDelimitedComment() throws RecognitionException {
        try {
            int _type = DelimitedComment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:190:3: ( '/*' ( . )* '*/;' ( NEWLINE )* )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:190:5: '/*' ( . )* '*/;' ( NEWLINE )*
            {
            match("/*"); 



            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:190:10: ( . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        int LA9_3 = input.LA(3);

                        if ( (LA9_3==';') ) {
                            alt9=2;
                        }
                        else if ( ((LA9_3 >= '\u0000' && LA9_3 <= ':')||(LA9_3 >= '<' && LA9_3 <= '\uFFFF')) ) {
                            alt9=1;
                        }


                    }
                    else if ( ((LA9_1 >= '\u0000' && LA9_1 <= '.')||(LA9_1 >= '0' && LA9_1 <= '\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0 >= '\u0000' && LA9_0 <= ')')||(LA9_0 >= '+' && LA9_0 <= '\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:190:10: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match("*/;"); 



            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:190:19: ( NEWLINE )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:190:21: NEWLINE
            	    {
            	    mNEWLINE(); 


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DelimitedComment"

    // $ANTLR start "LockStmt"
    public final void mLockStmt() throws RecognitionException {
        try {
            int _type = LockStmt;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:196:2: ( LOCK ( . )* ';' ( NEWLINE )* )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:196:4: LOCK ( . )* ';' ( NEWLINE )*
            {
            mLOCK(); 


            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:196:11: ( . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==';') ) {
                    alt11=2;
                }
                else if ( ((LA11_0 >= '\u0000' && LA11_0 <= ':')||(LA11_0 >= '<' && LA11_0 <= '\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:196:11: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            match(';'); 

            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:196:18: ( NEWLINE )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:196:19: NEWLINE
            	    {
            	    mNEWLINE(); 


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LockStmt"

    // $ANTLR start "UnlockStmt"
    public final void mUnlockStmt() throws RecognitionException {
        try {
            int _type = UnlockStmt;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:199:2: ( UNLOCK ( . )* ';' ( NEWLINE )* )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:199:4: UNLOCK ( . )* ';' ( NEWLINE )*
            {
            mUNLOCK(); 


            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:199:11: ( . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==';') ) {
                    alt13=2;
                }
                else if ( ((LA13_0 >= '\u0000' && LA13_0 <= ':')||(LA13_0 >= '<' && LA13_0 <= '\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:199:11: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            match(';'); 

            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:199:18: ( NEWLINE )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:199:19: NEWLINE
            	    {
            	    mNEWLINE(); 


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UnlockStmt"

    // $ANTLR start "SetStmt"
    public final void mSetStmt() throws RecognitionException {
        try {
            int _type = SetStmt;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:201:9: ( SET ( . )* ';' ( NEWLINE )* )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:201:11: SET ( . )* ';' ( NEWLINE )*
            {
            mSET(); 


            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:201:15: ( . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==';') ) {
                    alt15=2;
                }
                else if ( ((LA15_0 >= '\u0000' && LA15_0 <= ':')||(LA15_0 >= '<' && LA15_0 <= '\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:201:15: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            match(';'); 

            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:201:22: ( NEWLINE )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:201:23: NEWLINE
            	    {
            	    mNEWLINE(); 


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SetStmt"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:203:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+ )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:203:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            {
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:203:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= 'A' && LA17_0 <= 'Z')||LA17_0=='_'||(LA17_0 >= 'a' && LA17_0 <= 'z')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "ITG"
    public final void mITG() throws RecognitionException {
        try {
            int _type = ITG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:205:5: ( ( '0' .. '9' )+ )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:205:7: ( '0' .. '9' )+
            {
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:205:7: ( '0' .. '9' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ITG"

    // $ANTLR start "MYSQL_QUOTED_STRING"
    public final void mMYSQL_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = MYSQL_QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:208:2: ( '`' (~ ( '`' ) )+ '`' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:208:4: '`' (~ ( '`' ) )+ '`'
            {
            match('`'); 

            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:208:8: (~ ( '`' ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0 >= '\u0000' && LA19_0 <= '_')||(LA19_0 >= 'a' && LA19_0 <= '\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MYSQL_QUOTED_STRING"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:210:9: ( ( '\\r' )? '\\n' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:210:11: ( '\\r' )? '\\n'
            {
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:210:11: ( '\\r' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:210:11: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "QUOTED_STRING"
    public final void mQUOTED_STRING() throws RecognitionException {
        try {
            int _type = QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:213:2: ( '\\'' (~ ( '\\'' ) )+ '\\'' )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:213:4: '\\'' (~ ( '\\'' ) )+ '\\''
            {
            match('\''); 

            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:213:9: (~ ( '\\'' ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0 >= '\u0000' && LA21_0 <= '&')||(LA21_0 >= '(' && LA21_0 <= '\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTED_STRING"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:215:4: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:215:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:215:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0 >= '\t' && LA22_0 <= '\n')||LA22_0=='\r'||LA22_0==' ') ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:8: ( T__45 | T__46 | T__47 | AUTO_INCREMENT | CHARSET | COLLATE | COLUMN_NAMES | CREATE | DATETIME | DEFAULT | DROP | ENGINE | EXISTS | IF | INSERT | INT | INTO | KEY | LOCK | MYISAM | NOT | NULL | PRIMARY | SET | TABLE | UNLOCK | UTF8 | UTF8_UNICODE_CI | VALUES | VARCHAR | LPAREN | RPAREN | EXPR_LIST | SingleLineComment | DelimitedComment | LockStmt | UnlockStmt | SetStmt | ID | ITG | MYSQL_QUOTED_STRING | NEWLINE | QUOTED_STRING | WS )
        int alt23=44;
        alt23 = dfa23.predict(input);
        switch (alt23) {
            case 1 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:10: T__45
                {
                mT__45(); 


                }
                break;
            case 2 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:16: T__46
                {
                mT__46(); 


                }
                break;
            case 3 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:22: T__47
                {
                mT__47(); 


                }
                break;
            case 4 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:28: AUTO_INCREMENT
                {
                mAUTO_INCREMENT(); 


                }
                break;
            case 5 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:43: CHARSET
                {
                mCHARSET(); 


                }
                break;
            case 6 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:51: COLLATE
                {
                mCOLLATE(); 


                }
                break;
            case 7 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:59: COLUMN_NAMES
                {
                mCOLUMN_NAMES(); 


                }
                break;
            case 8 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:72: CREATE
                {
                mCREATE(); 


                }
                break;
            case 9 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:79: DATETIME
                {
                mDATETIME(); 


                }
                break;
            case 10 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:88: DEFAULT
                {
                mDEFAULT(); 


                }
                break;
            case 11 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:96: DROP
                {
                mDROP(); 


                }
                break;
            case 12 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:101: ENGINE
                {
                mENGINE(); 


                }
                break;
            case 13 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:108: EXISTS
                {
                mEXISTS(); 


                }
                break;
            case 14 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:115: IF
                {
                mIF(); 


                }
                break;
            case 15 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:118: INSERT
                {
                mINSERT(); 


                }
                break;
            case 16 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:125: INT
                {
                mINT(); 


                }
                break;
            case 17 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:129: INTO
                {
                mINTO(); 


                }
                break;
            case 18 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:134: KEY
                {
                mKEY(); 


                }
                break;
            case 19 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:138: LOCK
                {
                mLOCK(); 


                }
                break;
            case 20 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:143: MYISAM
                {
                mMYISAM(); 


                }
                break;
            case 21 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:150: NOT
                {
                mNOT(); 


                }
                break;
            case 22 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:154: NULL
                {
                mNULL(); 


                }
                break;
            case 23 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:159: PRIMARY
                {
                mPRIMARY(); 


                }
                break;
            case 24 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:167: SET
                {
                mSET(); 


                }
                break;
            case 25 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:171: TABLE
                {
                mTABLE(); 


                }
                break;
            case 26 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:177: UNLOCK
                {
                mUNLOCK(); 


                }
                break;
            case 27 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:184: UTF8
                {
                mUTF8(); 


                }
                break;
            case 28 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:189: UTF8_UNICODE_CI
                {
                mUTF8_UNICODE_CI(); 


                }
                break;
            case 29 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:205: VALUES
                {
                mVALUES(); 


                }
                break;
            case 30 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:212: VARCHAR
                {
                mVARCHAR(); 


                }
                break;
            case 31 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:220: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 32 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:227: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 33 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:234: EXPR_LIST
                {
                mEXPR_LIST(); 


                }
                break;
            case 34 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:244: SingleLineComment
                {
                mSingleLineComment(); 


                }
                break;
            case 35 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:262: DelimitedComment
                {
                mDelimitedComment(); 


                }
                break;
            case 36 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:279: LockStmt
                {
                mLockStmt(); 


                }
                break;
            case 37 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:288: UnlockStmt
                {
                mUnlockStmt(); 


                }
                break;
            case 38 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:299: SetStmt
                {
                mSetStmt(); 


                }
                break;
            case 39 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:307: ID
                {
                mID(); 


                }
                break;
            case 40 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:310: ITG
                {
                mITG(); 


                }
                break;
            case 41 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:314: MYSQL_QUOTED_STRING
                {
                mMYSQL_QUOTED_STRING(); 


                }
                break;
            case 42 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:334: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 43 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:342: QUOTED_STRING
                {
                mQUOTED_STRING(); 


                }
                break;
            case 44 :
                // F:\\Documents and Settings\\Tom\\Desktop\\MySQLConnect.g:1:356: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA23_eotS =
        "\4\uffff\24\34\7\uffff\1\42\1\77\2\uffff\15\34\1\116\16\34\1\uffff"+
        "\16\34\1\uffff\1\34\2\160\1\161\2\34\1\164\2\34\1\167\17\34\1\u0089"+
        "\6\34\1\u0090\2\uffff\1\u0091\1\34\1\uffff\1\u0095\1\34\2\uffff"+
        "\3\34\1\u009a\14\34\1\uffff\6\34\3\uffff\2\34\1\uffff\1\34\1\u00af"+
        "\1\34\2\uffff\10\34\1\u00b9\5\34\1\u00bf\1\u00c0\1\34\1\u00c2\1"+
        "\u00c3\1\34\1\uffff\1\u00c5\1\u00c8\4\34\1\u00cd\1\u00ce\1\34\1"+
        "\uffff\1\u00ce\1\34\1\u00d1\1\34\1\u00d1\2\uffff\1\34\2\uffff\1"+
        "\u00d4\2\uffff\1\34\1\uffff\2\u00d5\2\34\2\uffff\1\34\1\u00d9\1"+
        "\uffff\1\u00d9\1\34\2\uffff\3\34\1\uffff\1\u00de\3\34\1\uffff\5"+
        "\34\1\u00e7\2\34\1\uffff\2\u00ea\1\uffff";
    static final String DFA23_eofS =
        "\u00eb\uffff";
    static final String DFA23_minS =
        "\1\11\3\uffff\1\125\1\165\1\110\1\157\1\101\1\141\1\116\1\106\1"+
        "\156\1\105\1\117\1\171\1\117\1\122\1\105\1\101\1\116\1\164\1\101"+
        "\1\141\7\uffff\1\12\1\11\2\uffff\1\124\1\164\1\101\1\114\1\105\1"+
        "\154\1\124\1\106\1\117\1\164\1\146\1\107\1\111\1\101\1\123\1\164"+
        "\1\131\1\103\1\111\1\124\1\114\1\111\1\124\1\102\1\114\1\146\1\114"+
        "\1\162\1\uffff\1\117\1\157\1\122\1\114\1\101\1\154\1\105\1\101\1"+
        "\120\1\145\1\141\1\111\1\123\1\122\1\uffff\1\105\3\101\1\113\1\123"+
        "\1\101\1\114\1\115\1\0\1\114\1\117\1\70\1\125\1\103\1\143\2\137"+
        "\1\123\1\101\1\115\1\124\1\141\1\124\1\125\1\101\1\164\1\165\1\116"+
        "\1\124\1\137\1\122\1\101\2\uffff\1\0\1\101\1\uffff\2\101\2\uffff"+
        "\1\0\1\105\1\103\1\137\1\105\1\110\1\150\1\111\1\151\1\105\1\124"+
        "\1\116\1\105\1\164\1\111\1\114\1\uffff\1\151\1\154\1\105\1\123\1"+
        "\114\1\124\3\uffff\1\0\1\115\1\uffff\1\122\1\101\1\113\2\uffff\1"+
        "\123\1\101\1\141\1\116\1\156\1\124\1\105\1\137\1\101\1\145\1\115"+
        "\1\124\1\155\1\164\2\101\1\111\2\101\1\131\1\uffff\1\0\1\101\1\122"+
        "\1\162\1\103\1\143\2\101\1\116\1\uffff\1\101\1\105\1\101\1\145\1"+
        "\101\2\uffff\1\123\2\uffff\1\101\2\uffff\1\0\1\uffff\2\101\1\122"+
        "\1\162\2\uffff\2\101\1\uffff\1\101\1\124\2\uffff\1\105\1\145\1\115"+
        "\1\uffff\1\101\1\115\1\155\1\105\1\uffff\1\105\1\145\1\123\1\116"+
        "\1\156\1\101\1\124\1\164\1\uffff\2\101\1\uffff";
    static final String DFA23_maxS =
        "\1\172\3\uffff\1\125\1\165\1\122\1\157\1\122\1\145\1\130\1\116\1"+
        "\156\1\105\1\117\1\171\1\125\1\122\1\105\1\101\1\116\1\164\1\101"+
        "\1\141\7\uffff\1\12\1\40\2\uffff\1\124\1\164\1\101\1\114\1\105\1"+
        "\154\1\124\1\106\1\117\1\164\1\146\1\107\1\120\1\172\1\124\1\164"+
        "\1\131\1\103\1\111\1\124\1\114\1\111\1\124\1\102\1\114\1\146\1\122"+
        "\1\162\1\uffff\1\117\1\157\1\122\1\125\1\101\1\154\1\105\1\101\1"+
        "\120\1\145\1\141\1\111\1\123\1\122\1\uffff\1\105\3\172\1\113\1\123"+
        "\1\172\1\114\1\115\1\uffff\1\114\1\117\1\70\1\125\1\103\1\143\2"+
        "\137\1\123\1\101\1\115\1\124\1\141\1\124\1\125\1\172\1\164\1\165"+
        "\1\116\1\124\1\137\1\122\1\172\2\uffff\1\uffff\1\101\1\uffff\1\172"+
        "\1\101\2\uffff\1\uffff\1\105\1\103\1\137\1\105\1\110\1\150\1\111"+
        "\1\151\1\105\1\124\1\116\1\105\1\164\1\111\1\114\1\uffff\1\151\1"+
        "\154\1\105\1\123\1\114\1\124\3\uffff\1\uffff\1\115\1\uffff\1\122"+
        "\1\172\1\113\2\uffff\1\123\1\101\1\141\1\116\1\156\1\124\1\105\1"+
        "\137\1\172\1\145\1\115\1\124\1\155\1\164\2\172\1\111\2\172\1\131"+
        "\1\uffff\1\uffff\1\172\1\122\1\162\1\103\1\143\2\172\1\116\1\uffff"+
        "\1\172\1\105\1\172\1\145\1\172\2\uffff\1\123\2\uffff\1\172\2\uffff"+
        "\1\uffff\1\uffff\2\172\1\122\1\162\2\uffff\1\101\1\172\1\uffff\1"+
        "\172\1\124\2\uffff\1\105\1\145\1\115\1\uffff\1\172\1\115\1\155\1"+
        "\105\1\uffff\1\105\1\145\1\123\1\116\1\156\1\172\1\124\1\164\1\uffff"+
        "\2\172\1\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\2\1\3\24\uffff\1\37\1\40\1\42\1\43\1\47\1\50\1\51"+
        "\2\uffff\1\53\1\54\34\uffff\1\52\16\uffff\1\16\41\uffff\1\20\1\22"+
        "\2\uffff\1\25\2\uffff\1\30\1\46\20\uffff\1\13\6\uffff\1\21\1\23"+
        "\1\44\2\uffff\1\26\3\uffff\1\34\1\33\24\uffff\1\31\11\uffff\1\10"+
        "\5\uffff\1\14\1\15\1\uffff\1\17\1\24\1\uffff\1\32\1\45\1\uffff\1"+
        "\35\4\uffff\1\5\1\6\2\uffff\1\12\2\uffff\1\27\1\36\3\uffff\1\11"+
        "\4\uffff\1\41\10\uffff\1\7\2\uffff\1\4";
    static final String DFA23_specialS =
        "\130\uffff\1\4\31\uffff\1\5\6\uffff\1\2\31\uffff\1\0\34\uffff\1"+
        "\1\26\uffff\1\3\43\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\42\1\40\2\uffff\1\37\22\uffff\1\42\6\uffff\1\41\1\30\1\31"+
            "\2\uffff\1\1\1\32\1\uffff\1\33\12\35\1\uffff\1\2\1\uffff\1\3"+
            "\3\uffff\1\4\1\34\1\6\1\10\1\12\3\34\1\13\1\34\1\15\1\16\1\17"+
            "\1\20\1\34\1\21\2\34\1\22\1\23\1\24\1\26\4\34\4\uffff\1\34\1"+
            "\36\1\5\1\34\1\7\1\11\4\34\1\14\13\34\1\25\1\27\4\34",
            "",
            "",
            "",
            "\1\43",
            "\1\44",
            "\1\45\6\uffff\1\46\2\uffff\1\47",
            "\1\50",
            "\1\51\3\uffff\1\52\14\uffff\1\53",
            "\1\54\3\uffff\1\55",
            "\1\56\11\uffff\1\57",
            "\1\60\7\uffff\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66\5\uffff\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\40",
            "\2\42\2\uffff\1\42\22\uffff\1\42",
            "",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114\6\uffff\1\115",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\117\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134\5\uffff\1\135",
            "\1\136",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142\10\uffff\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "\1\156",
            "\16\34\1\157\13\34\4\uffff\1\34\1\uffff\32\34",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\162",
            "\1\163",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\165",
            "\1\166",
            "\101\170\32\171\4\170\1\171\1\170\32\171\uff85\170",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\101\u0092\32\u0093\4\u0092\1\u0093\1\u0092\32\u0093\uff85"+
            "\u0092",
            "\1\u0094",
            "",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u0096",
            "",
            "",
            "\101\170\32\171\4\170\1\171\1\170\32\171\uff85\170",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "",
            "",
            "\101\u0092\32\u0093\4\u0092\1\u0093\1\u0092\32\u0093\uff85"+
            "\u0092",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00b0",
            "",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00c1",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00c4",
            "",
            "\101\u00c6\32\u00c7\4\u00c6\1\u00c7\1\u00c6\32\u00c7\uff85"+
            "\u00c6",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00cf",
            "",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00d0",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00d2",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\1\u00d3",
            "",
            "",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\101\u00c6\32\u00c7\4\u00c6\1\u00c7\1\u00c6\32\u00c7\uff85"+
            "\u00c6",
            "",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00d6",
            "\1\u00d7",
            "",
            "",
            "\1\u00d8",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00da",
            "",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__45 | T__46 | T__47 | AUTO_INCREMENT | CHARSET | COLLATE | COLUMN_NAMES | CREATE | DATETIME | DEFAULT | DROP | ENGINE | EXISTS | IF | INSERT | INT | INTO | KEY | LOCK | MYISAM | NOT | NULL | PRIMARY | SET | TABLE | UNLOCK | UTF8 | UTF8_UNICODE_CI | VALUES | VARCHAR | LPAREN | RPAREN | EXPR_LIST | SingleLineComment | DelimitedComment | LockStmt | UnlockStmt | SetStmt | ID | ITG | MYSQL_QUOTED_STRING | NEWLINE | QUOTED_STRING | WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_147 = input.LA(1);

                        s = -1;
                        if ( ((LA23_147 >= '\u0000' && LA23_147 <= '@')||(LA23_147 >= '[' && LA23_147 <= '^')||LA23_147=='`'||(LA23_147 >= '{' && LA23_147 <= '\uFFFF')) ) {s = 146;}

                        else if ( ((LA23_147 >= 'A' && LA23_147 <= 'Z')||LA23_147=='_'||(LA23_147 >= 'a' && LA23_147 <= 'z')) ) {s = 147;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA23_176 = input.LA(1);

                        s = -1;
                        if ( ((LA23_176 >= '\u0000' && LA23_176 <= '@')||(LA23_176 >= '[' && LA23_176 <= '^')||LA23_176=='`'||(LA23_176 >= '{' && LA23_176 <= '\uFFFF')) ) {s = 198;}

                        else if ( ((LA23_176 >= 'A' && LA23_176 <= 'Z')||LA23_176=='_'||(LA23_176 >= 'a' && LA23_176 <= 'z')) ) {s = 199;}

                        else s = 197;

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA23_121 = input.LA(1);

                        s = -1;
                        if ( ((LA23_121 >= '\u0000' && LA23_121 <= '@')||(LA23_121 >= '[' && LA23_121 <= '^')||LA23_121=='`'||(LA23_121 >= '{' && LA23_121 <= '\uFFFF')) ) {s = 120;}

                        else if ( ((LA23_121 >= 'A' && LA23_121 <= 'Z')||LA23_121=='_'||(LA23_121 >= 'a' && LA23_121 <= 'z')) ) {s = 121;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA23_199 = input.LA(1);

                        s = -1;
                        if ( ((LA23_199 >= '\u0000' && LA23_199 <= '@')||(LA23_199 >= '[' && LA23_199 <= '^')||LA23_199=='`'||(LA23_199 >= '{' && LA23_199 <= '\uFFFF')) ) {s = 198;}

                        else if ( ((LA23_199 >= 'A' && LA23_199 <= 'Z')||LA23_199=='_'||(LA23_199 >= 'a' && LA23_199 <= 'z')) ) {s = 199;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA23_88 = input.LA(1);

                        s = -1;
                        if ( ((LA23_88 >= '\u0000' && LA23_88 <= '@')||(LA23_88 >= '[' && LA23_88 <= '^')||LA23_88=='`'||(LA23_88 >= '{' && LA23_88 <= '\uFFFF')) ) {s = 120;}

                        else if ( ((LA23_88 >= 'A' && LA23_88 <= 'Z')||LA23_88=='_'||(LA23_88 >= 'a' && LA23_88 <= 'z')) ) {s = 121;}

                        else s = 119;

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA23_114 = input.LA(1);

                        s = -1;
                        if ( ((LA23_114 >= '\u0000' && LA23_114 <= '@')||(LA23_114 >= '[' && LA23_114 <= '^')||LA23_114=='`'||(LA23_114 >= '{' && LA23_114 <= '\uFFFF')) ) {s = 146;}

                        else if ( ((LA23_114 >= 'A' && LA23_114 <= 'Z')||LA23_114=='_'||(LA23_114 >= 'a' && LA23_114 <= 'z')) ) {s = 147;}

                        else s = 145;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}