// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g 2010-11-12 23:37:51

package org.eclipse.ecl.internal.parser;
import org.eclipse.ecl.parser.IEclParserErrorReporter;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class EclLexer extends Lexer {
    public static final int RBRACK=11;
    public static final int LBRACK=10;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int SYMBOL=19;
    public static final int T__26=26;
    public static final int SingleLineComment=25;
    public static final int NUMBER=15;
    public static final int LCURLY=21;
    public static final int AND=6;
    public static final int EOF=-1;
    public static final int SEMI=18;
    public static final int COLON=5;
    public static final int NAME=12;
    public static final int WS=23;
    public static final int NEWLINE=4;
    public static final int CURLY_STRING=17;
    public static final int DNAME=13;
    public static final int OR=7;
    public static final int RCURLY=22;
    public static final int LOPEN=8;
    public static final int IP4=14;
    public static final int DIGIT=20;
    public static final int ROPEN=9;
    public static final int MultiLineComment=24;
    public static final int STRING=16;

    	private IEclParserErrorReporter reporter;
    	public void setErrorReporter(IEclParserErrorReporter reporter) {
    		this.reporter = reporter;
    	}
    	public void displayRecognitionError(String[] tokenNames,
                                            RecognitionException e) {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            // Now do something with hdr and msg...
            if( this.reporter != null ) {
            	this.reporter.reportError(hdr, msg);
            }
        }
    	
    	List tokens = new ArrayList();
    	public void emit(Token token) {
    	        token = token;
    	    	tokens.add(token);
    	}
    	public Token nextToken() {
    	    	super.nextToken();
    	        if ( tokens.size()==0 ) {
    	            return Token.EOF_TOKEN;
    	        }
    	        return (Token)tokens.remove(0);
    	}


    // delegates
    // delegators

    public EclLexer() {;} 
    public EclLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public EclLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g"; }

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:40:7: ( '@' )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:40:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:41:7: ( '-' )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:41:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:42:7: ( '=' )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:42:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:269:6: ( ';' )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:269:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:270:4: ( '&' )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:270:6: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:271:3: ( '|' )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:271:5: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:272:5: ( ':' )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:272:7: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "SYMBOL"
    public final void mSYMBOL() throws RecognitionException {
        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:274:16: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '/' ) )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:275:3: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '/' )
            {
            if ( (input.LA(1)>='.' && input.LA(1)<='/')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "SYMBOL"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:278:15: ( ( '0' .. '9' ) )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:279:1: ( '0' .. '9' )
            {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:279:1: ( '0' .. '9' )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:279:2: '0' .. '9'
            {
            matchRange('0','9'); 

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:282:7: ( ( DIGIT )+ )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:283:3: ( DIGIT )+
            {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:283:3: ( DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:283:3: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "IP4"
    public final void mIP4() throws RecognitionException {
        try {
            int _type = IP4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:287:4: ( NUMBER '.' NUMBER '.' NUMBER '.' NUMBER )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:288:3: NUMBER '.' NUMBER '.' NUMBER '.' NUMBER
            {
            mNUMBER(); 
            match('.'); 
            mNUMBER(); 
            match('.'); 
            mNUMBER(); 
            match('.'); 
            mNUMBER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IP4"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:291:7: ( '\"' (~ ( '\"' | '\\n' | '\\\\' ) | ( '\\\\' . ) )* '\"' )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:292:4: '\"' (~ ( '\"' | '\\n' | '\\\\' ) | ( '\\\\' . ) )* '\"'
            {
            match('\"'); 
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:292:8: (~ ( '\"' | '\\n' | '\\\\' ) | ( '\\\\' . ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }
                else if ( (LA2_0=='\\') ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:292:9: ~ ( '\"' | '\\n' | '\\\\' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:292:26: ( '\\\\' . )
            	    {
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:292:26: ( '\\\\' . )
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:292:27: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "LOPEN"
    public final void mLOPEN() throws RecognitionException {
        try {
            int _type = LOPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:295:8: ( '(' )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:295:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOPEN"

    // $ANTLR start "ROPEN"
    public final void mROPEN() throws RecognitionException {
        try {
            int _type = ROPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:298:8: ( ')' )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:298:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROPEN"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:301:9: ( '{' )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:301:11: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LCURLY"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:304:9: ( '}' )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:304:11: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:307:9: ( '[' )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:307:11: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:310:9: ( ']' )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:310:11: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "CURLY_STRING"
    public final void mCURLY_STRING() throws RecognitionException {
        try {
            int _type = CURLY_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:312:13: ( LCURLY ( . )* RCURLY )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:312:15: LCURLY ( . )* RCURLY
            {
             int deep = 0; 
            mLCURLY(); 
             deep += 1; 
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:314:3: ( . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='}') ) {
                    int LA3_1 = input.LA(2);

                    if ( ((LA3_1>='\u0000' && LA3_1<='\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='|')||(LA3_0>='~' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:315:3: .
            	    {
            	     
            	        if( input.LA( 1 ) == '{' ) {
            	          deep += 1;
            	        }
            	        else if( input.LA( 1 ) == '}' ) {
            	          deep -= 1;
            	        }
            	        if( deep == 0 ) {
            	          break loop3;
            	        }
            	      
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            mRCURLY(); 
             
              if( deep > 1 ) {
                MismatchedTokenException e = new MismatchedTokenException(RCURLY,input);
                e.expecting='}';
                throw e;
              }
              

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CURLY_STRING"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:336:5: ( SYMBOL ( SYMBOL | DIGIT )* )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:337:2: SYMBOL ( SYMBOL | DIGIT )*
            {
            mSYMBOL(); 
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:337:9: ( SYMBOL | DIGIT )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='.' && LA4_0<='/')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }
                else if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:337:10: SYMBOL
            	    {
            	    mSYMBOL(); 

            	    }
            	    break;
            	case 2 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:337:17: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "DNAME"
    public final void mDNAME() throws RecognitionException {
        try {
            int _type = DNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:351:6: ( NAME ( '-' NAME )+ )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:352:2: NAME ( '-' NAME )+
            {
            mNAME(); 
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:352:7: ( '-' NAME )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='-') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:352:8: '-' NAME
            	    {
            	    match('-'); 
            	    mNAME(); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DNAME"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:355:3: ( ( ' ' | '\\t' )+ )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:355:5: ( ' ' | '\\t' )+
            {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:355:5: ( ' ' | '\\t' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\t'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


              _channel=HIDDEN;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:362:5: ( ( '\\r' | '\\n' )+ )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:362:9: ( '\\r' | '\\n' )+
            {
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:362:9: ( '\\r' | '\\n' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "MultiLineComment"
    public final void mMultiLineComment() throws RecognitionException {
        try {
            int _type = MultiLineComment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:365:18: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:366:3: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:366:8: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:366:36: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MultiLineComment"

    // $ANTLR start "SingleLineComment"
    public final void mSingleLineComment() throws RecognitionException {
        try {
            int _type = SingleLineComment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:368:19: ( '//' | '#' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )? )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='/') ) {
                alt12=1;
            }
            else if ( (LA12_0=='#') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:369:3: '//'
                    {
                    match("//"); 


                    }
                    break;
                case 2 :
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:369:8: '#' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' ( '\\n' )? )?
                    {
                    match('#'); 
                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:369:12: (~ ( '\\n' | '\\r' ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:369:13: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:369:28: ( '\\n' | '\\r' ( '\\n' )? )?
                    int alt11=3;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\n') ) {
                        alt11=1;
                    }
                    else if ( (LA11_0=='\r') ) {
                        alt11=2;
                    }
                    switch (alt11) {
                        case 1 :
                            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:369:29: '\\n'
                            {
                            match('\n'); 

                            }
                            break;
                        case 2 :
                            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:369:34: '\\r' ( '\\n' )?
                            {
                            match('\r'); 
                            // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:369:38: ( '\\n' )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0=='\n') ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:369:39: '\\n'
                                    {
                                    match('\n'); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SingleLineComment"

    public void mTokens() throws RecognitionException {
        // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:1:8: ( T__26 | T__27 | T__28 | COLON | AND | OR | SEMI | NUMBER | IP4 | STRING | LOPEN | ROPEN | LCURLY | RCURLY | LBRACK | RBRACK | CURLY_STRING | NAME | DNAME | WS | NEWLINE | MultiLineComment | SingleLineComment )
        int alt13=23;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:1:10: T__26
                {
                mT__26(); 

                }
                break;
            case 2 :
                // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:1:16: T__27
                {
                mT__27(); 

                }
                break;
            case 3 :
                // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:1:22: T__28
                {
                mT__28(); 

                }
                break;
            case 4 :
                // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:1:28: COLON
                {
                mCOLON(); 

                }
                break;
            case 5 :
                // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:1:34: AND
                {
                mAND(); 

                }
                break;
            case 6 :
                // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:1:38: OR
                {
                mOR(); 

                }
                break;
            case 7 :
                // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:1:41: SEMI
                {
                mSEMI(); 

                }
                break;
            case 8 :
                // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:1:46: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 9 :
                // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:1:53: IP4
                {
                mIP4(); 

                }
                break;
            case 10 :
                // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:1:57: STRING
                {
                mSTRING(); 

                }
                break;
            case 11 :
                // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:1:64: LOPEN
                {
                mLOPEN(); 

                }
                break;
            case 12 :
                // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:1:70: ROPEN
                {
                mROPEN(); 

                }
                break;
            case 13 :
                // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:1:76: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 14 :
                // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:1:83: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 15 :
                // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:1:90: LBRACK
                {
                mLBRACK(); 

                }
                break;
            case 16 :
                // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:1:97: RBRACK
                {
                mRBRACK(); 

                }
                break;
            case 17 :
                // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:1:104: CURLY_STRING
                {
                mCURLY_STRING(); 

                }
                break;
            case 18 :
                // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:1:117: NAME
                {
                mNAME(); 

                }
                break;
            case 19 :
                // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:1:122: DNAME
                {
                mDNAME(); 

                }
                break;
            case 20 :
                // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:1:128: WS
                {
                mWS(); 

                }
                break;
            case 21 :
                // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:1:131: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 22 :
                // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:1:139: MultiLineComment
                {
                mMultiLineComment(); 

                }
                break;
            case 23 :
                // D:\\work\\ecl\\workspace\\org.eclipse.ecl.parser\\antlr\\Ecl.g:1:156: SingleLineComment
                {
                mSingleLineComment(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\10\uffff\1\25\3\uffff\1\27\3\uffff\1\33\2\uffff\1\33\6\uffff\1"+
        "\33\1\uffff\2\33\1\uffff";
    static final String DFA13_eofS =
        "\37\uffff";
    static final String DFA13_minS =
        "\1\11\7\uffff\1\56\3\uffff\1\0\3\uffff\1\52\2\uffff\1\55\6\uffff"+
        "\1\55\1\uffff\2\55\1\uffff";
    static final String DFA13_maxS =
        "\1\175\7\uffff\1\71\3\uffff\1\uffff\3\uffff\1\172\2\uffff\1\172"+
        "\6\uffff\1\172\1\uffff\2\172\1\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\13\1\14\1\uffff"+
        "\1\16\1\17\1\20\1\uffff\1\24\1\25\1\uffff\1\27\1\10\1\11\1\15\1"+
        "\21\1\26\1\uffff\1\22\2\uffff\1\23";
    static final String DFA13_specialS =
        "\14\uffff\1\0\22\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\21\1\22\2\uffff\1\22\22\uffff\1\21\1\uffff\1\11\1\24\2\uffff"+
            "\1\5\1\uffff\1\12\1\13\3\uffff\1\2\1\23\1\20\12\10\1\7\1\4\1"+
            "\uffff\1\3\2\uffff\1\1\32\23\1\16\1\uffff\1\17\1\uffff\1\23"+
            "\1\uffff\32\23\1\14\1\6\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\26\1\uffff\12\10",
            "",
            "",
            "",
            "\0\30",
            "",
            "",
            "",
            "\1\31\2\uffff\1\36\1\34\1\32\12\35\7\uffff\32\34\4\uffff\1"+
            "\34\1\uffff\32\34",
            "",
            "",
            "\1\36\2\34\12\35\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36\2\34\12\35\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\36\2\34\12\35\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\36\2\34\12\35\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__26 | T__27 | T__28 | COLON | AND | OR | SEMI | NUMBER | IP4 | STRING | LOPEN | ROPEN | LCURLY | RCURLY | LBRACK | RBRACK | CURLY_STRING | NAME | DNAME | WS | NEWLINE | MultiLineComment | SingleLineComment );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_12 = input.LA(1);

                        s = -1;
                        if ( ((LA13_12>='\u0000' && LA13_12<='\uFFFF')) ) {s = 24;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}