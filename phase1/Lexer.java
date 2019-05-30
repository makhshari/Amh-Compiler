/* The following code was generated by JFlex 1.6.1 */



import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>myLexer.lex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\1\7\10\0\1\0\1\6\1\21\1\21\1\21\22\0\1\0\2\0"+
    "\1\3\3\0\1\5\1\41\1\42\1\0\1\54\1\47\1\55\1\4"+
    "\1\20\12\2\1\51\1\50\1\53\1\56\1\52\2\0\32\1\1\45"+
    "\1\0\1\46\3\0\1\15\1\32\1\30\1\34\1\13\1\14\1\24"+
    "\1\31\1\26\2\1\1\16\1\25\1\27\1\23\1\22\1\1\1\11"+
    "\1\17\1\10\1\12\1\33\1\35\1\37\1\40\1\36\1\43\1\0"+
    "\1\44\7\0\1\21\u1fa2\0\1\21\1\21\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\1\1\3\1\1\1\4\1\5"+
    "\22\1\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\15\0"+
    "\1\24\11\0\1\25\1\26\1\0\1\27\2\0\1\30"+
    "\1\31\1\0\1\32\3\0\1\33\3\0\1\34\6\0"+
    "\1\35\11\0\1\36\1\0\1\37\1\0\1\40\1\41"+
    "\1\0\1\42\3\0\1\43\2\0\1\44\4\0\1\45"+
    "\3\0\1\46\1\47\1\50\2\0\1\51\5\0\1\52"+
    "\1\0\1\53\2\0\1\54\3\0\1\55\1\56\1\57"+
    "\1\0\1\60\1\61\1\62";

  private static int [] zzUnpackAction() {
    int [] result = new int[147];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\57\0\136\0\215\0\57\0\274\0\57\0\57"+
    "\0\353\0\u011a\0\u0149\0\u0178\0\u01a7\0\u01d6\0\u0205\0\u0234"+
    "\0\u0263\0\u0292\0\u02c1\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac"+
    "\0\u03db\0\u040a\0\57\0\57\0\57\0\57\0\u0439\0\57"+
    "\0\57\0\57\0\u0468\0\57\0\57\0\57\0\57\0\136"+
    "\0\u0497\0\u04c6\0\u04f5\0\u0524\0\u0553\0\u0582\0\u05b1\0\u05e0"+
    "\0\u060f\0\u063e\0\u066d\0\u069c\0\u06cb\0\u06fa\0\u0729\0\u0758"+
    "\0\u0787\0\u07b6\0\u07e5\0\u0814\0\u0843\0\u0872\0\u08a1\0\u08d0"+
    "\0\u08ff\0\u092e\0\57\0\u095d\0\u098c\0\57\0\u0497\0\u09bb"+
    "\0\57\0\u09ea\0\u0a19\0\u0a48\0\57\0\u0a77\0\u0aa6\0\u0ad5"+
    "\0\57\0\u0b04\0\u0b33\0\u0b62\0\u0b91\0\u0bc0\0\u0bef\0\57"+
    "\0\u0c1e\0\u0c4d\0\u0c7c\0\u0cab\0\u0cda\0\u0d09\0\u0d38\0\u0d67"+
    "\0\u0d96\0\57\0\u0dc5\0\57\0\u0df4\0\57\0\57\0\u0e23"+
    "\0\57\0\u0e52\0\u0e81\0\u0eb0\0\57\0\u0edf\0\u0f0e\0\57"+
    "\0\u0f3d\0\u0f6c\0\u0f9b\0\u0fca\0\57\0\u0ff9\0\u1028\0\u1057"+
    "\0\57\0\57\0\57\0\u1086\0\u10b5\0\57\0\u10e4\0\u1113"+
    "\0\u1142\0\u1171\0\u11a0\0\57\0\u11cf\0\57\0\u11fe\0\u122d"+
    "\0\57\0\u125c\0\u128b\0\u12ba\0\57\0\57\0\57\0\u12e9"+
    "\0\57\0\57\0\57";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[147];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\2\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\2\2\1\17\1\2"+
    "\1\20\1\2\1\21\1\22\1\23\1\24\1\25\1\2"+
    "\1\26\1\27\1\30\1\31\2\2\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\2\61\0\1\50\1\0\1\51"+
    "\53\0\1\52\6\0\10\52\2\0\17\52\17\0\2\53"+
    "\5\0\10\53\2\0\17\53\27\0\1\54\62\0\1\55"+
    "\63\0\1\56\63\0\1\57\7\0\1\60\34\0\1\61"+
    "\1\62\4\0\1\63\57\0\1\64\2\0\1\65\47\0"+
    "\1\66\47\0\1\67\70\0\1\70\50\0\1\71\5\0"+
    "\1\72\62\0\1\73\44\0\1\74\72\0\1\75\42\0"+
    "\1\76\5\0\1\77\50\0\1\100\64\0\1\101\64\0"+
    "\1\102\42\0\1\103\42\0\1\104\1\105\5\0\10\104"+
    "\2\0\17\104\74\0\1\106\2\0\1\107\55\0\1\110"+
    "\6\0\10\110\2\0\17\110\23\0\1\111\63\0\1\112"+
    "\77\0\1\113\33\0\1\114\102\0\1\115\50\0\1\116"+
    "\46\0\1\117\63\0\1\120\44\0\1\121\62\0\1\122"+
    "\65\0\1\123\32\0\6\66\1\0\12\66\1\0\35\66"+
    "\23\0\1\124\71\0\1\125\46\0\1\126\41\0\1\127"+
    "\55\0\1\130\72\0\1\131\47\0\1\132\77\0\1\133"+
    "\43\0\1\134\57\0\1\135\67\0\1\136\34\0\1\137"+
    "\12\0\1\140\34\0\1\141\56\0\1\141\41\0\1\142"+
    "\12\0\1\143\67\0\1\144\71\0\1\145\53\0\1\146"+
    "\43\0\1\147\65\0\1\112\54\0\1\150\52\0\1\151"+
    "\62\0\1\152\65\0\1\153\60\0\1\154\57\0\1\155"+
    "\42\0\1\156\74\0\1\157\36\0\1\160\71\0\1\161"+
    "\50\0\1\162\55\0\1\163\70\0\1\164\56\0\1\165"+
    "\45\0\1\166\44\0\1\167\54\0\1\170\67\0\1\171"+
    "\53\0\1\172\77\0\1\173\36\0\1\174\74\0\1\175"+
    "\63\0\1\176\50\0\1\177\45\0\1\200\54\0\1\201"+
    "\54\0\1\202\55\0\1\203\61\0\1\204\44\0\2\205"+
    "\5\0\10\205\2\0\17\205\20\0\1\206\71\0\1\207"+
    "\54\0\1\210\101\0\1\211\37\0\1\212\54\0\1\213"+
    "\70\0\1\214\52\0\1\215\101\0\1\142\35\0\1\216"+
    "\62\0\1\217\56\0\1\220\54\0\1\221\44\0\1\222"+
    "\51\0\1\223\46\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4888];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\1\1\2\11\22\1\4\11"+
    "\1\1\3\11\1\1\4\11\1\1\15\0\1\1\11\0"+
    "\2\1\1\0\1\11\2\0\1\11\1\1\1\0\1\11"+
    "\3\0\1\11\3\0\1\11\6\0\1\11\11\0\1\11"+
    "\1\0\1\11\1\0\2\11\1\0\1\11\3\0\1\11"+
    "\2\0\1\11\4\0\1\11\3\0\3\11\2\0\1\11"+
    "\5\0\1\11\1\0\1\11\2\0\1\11\3\0\3\11"+
    "\1\0\3\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[147];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
	private FileOutputStream out;
	private DataOutputStream dos;

	private void writeOutputFile(String s){
		try {
			if(out == null){
				out = new FileOutputStream(new File("output.txt"));
				dos = new DataOutputStream(out);
				
				s = s + "\r\n";
				byte[] data = s.getBytes("UTF-8");
				dos.write(data);
			}
			else{
				s = s + "\r\n";
				byte[] data = s.getBytes("UTF-8");
				dos.write(data);
			}
		} 
		catch (Exception e){
			e.printStackTrace();
		}
	}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 166) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.print(yytext());
            }
          case 51: break;
          case 2: 
            { writeOutputFile( "KEWORD : DIGIT : " + yytext() ) ;
            }
          case 52: break;
          case 3: 
            { writeOutputFile( "KEWORD : NOQTE : " + yytext() ) ;
            }
          case 53: break;
          case 4: 
            { writeOutputFile( "KEWORD : NEWLINE  "  ) ;
            }
          case 54: break;
          case 5: 
            { writeOutputFile( "KEWORD : NULL : " + yytext() ) ;
            }
          case 55: break;
          case 6: 
            { writeOutputFile( "KEWORD : PARANTEZ_BAZ : " + yytext() ) ;
            }
          case 56: break;
          case 7: 
            { writeOutputFile( "KEWORD : PARANTEZ_BASTE : " + yytext() ) ;
            }
          case 57: break;
          case 8: 
            { writeOutputFile( "KEWORD : AKOLAD_BAZ : " + yytext() ) ;
            }
          case 58: break;
          case 9: 
            { writeOutputFile( "KEWORD : AKOLAD_BASTE : " + yytext() ) ;
            }
          case 59: break;
          case 10: 
            { writeOutputFile( "KEWORD : BRACKET_BAZ : " + yytext() ) ;
            }
          case 60: break;
          case 11: 
            { writeOutputFile( "KEWORD : BRACKET_BASTE : " + yytext() ) ;
            }
          case 61: break;
          case 12: 
            { writeOutputFile( "KEWORD : COMMA : " + yytext() ) ;
            }
          case 62: break;
          case 13: 
            { writeOutputFile( "KEWORD : SEMICOLON : " + yytext() ) ;
            }
          case 63: break;
          case 14: 
            { writeOutputFile( "KEWORD : COLON : " + yytext() ) ;
            }
          case 64: break;
          case 15: 
            { writeOutputFile( "KEWORD : BOZORGTAR : " + yytext() ) ;
            }
          case 65: break;
          case 16: 
            { writeOutputFile( "KEWORD : KUCHIKTAR : " + yytext() ) ;
            }
          case 66: break;
          case 17: 
            { writeOutputFile( "KEWORD : PLUS : " + yytext() ) ;
            }
          case 67: break;
          case 18: 
            { writeOutputFile( "KEWORD : MINUS : " + yytext() ) ;
            }
          case 68: break;
          case 19: 
            { writeOutputFile( "KEWORD : ADADSABET : " + yytext() ) ;
            }
          case 69: break;
          case 20: 
            { writeOutputFile( "KEWORD : COMMENTS : " + yytext() ) ;
            }
          case 70: break;
          case 21: 
            { writeOutputFile( "KEWORD : VA : " + yytext() ) ;
            }
          case 71: break;
          case 22: 
            { writeOutputFile( "KEWORD : DO : " + yytext() ) ;
            }
          case 72: break;
          case 23: 
            { writeOutputFile( "KEWORD : YA : " + yytext() ) ;
            }
          case 73: break;
          case 24: 
            { writeOutputFile( "KEWORD : EQUAL : " + yytext() ) ;
            }
          case 74: break;
          case 25: 
            { writeOutputFile( "KEWORD : REALCONST : " + yytext() ) ;
            }
          case 75: break;
          case 26: 
            { writeOutputFile( "KEWORD : HARF : " + yytext() ) ;
            }
          case 76: break;
          case 27: 
            { writeOutputFile( "KEWORD : END : " + yytext() ) ;
            }
          case 77: break;
          case 28: 
            { writeOutputFile( "KEWORD : FOR : " + yytext() ) ;
            }
          case 78: break;
          case 29: 
            { writeOutputFile( "KEWORD : INT : " + yytext() ) ;
            }
          case 79: break;
          case 30: 
            { writeOutputFile( "KEWORD : INDEX : " + yytext() ) ;
            }
          case 80: break;
          case 31: 
            { writeOutputFile( "KEWORD : BOOLSABET : " + yytext() ) ;
            }
          case 81: break;
          case 32: 
            { writeOutputFile( "KEWORD : UPTO : " + yytext() ) ;
            }
          case 82: break;
          case 33: 
            { writeOutputFile( "KEWORD : EXIT : " + yytext() ) ;
            }
          case 83: break;
          case 34: 
            { writeOutputFile( "KEWORD : AGAR : " + yytext() ) ;
            }
          case 84: break;
          case 35: 
            { writeOutputFile( "KEWORD : MAIN : " + yytext() ) ;
            }
          case 85: break;
          case 36: 
            { writeOutputFile( "KEWORD : CHAR : " + yytext() ) ;
            }
          case 86: break;
          case 37: 
            { writeOutputFile( "KEWORD : WHEN : " + yytext() ) ;
            }
          case 87: break;
          case 38: 
            { writeOutputFile( "KEWORD : RAVIE : " + yytext() ) ;
            }
          case 88: break;
          case 39: 
            { writeOutputFile( "KEWORD : FLOAT : " + yytext() ) ;
            }
          case 89: break;
          case 40: 
            { writeOutputFile( "KEWORD : ANGAH : " + yytext() ) ;
            }
          case 90: break;
          case 41: 
            { writeOutputFile( "KEWORD : MORED : " + yytext() ) ;
            }
          case 91: break;
          case 42: 
            { writeOutputFile( "KEWORD : WHILE : " + yytext() ) ;
            }
          case 92: break;
          case 43: 
            { writeOutputFile( "KEWORD : SHENASE : " + yytext() ) ;
            }
          case 93: break;
          case 44: 
            { writeOutputFile( "KEWORD : NAGHIZ : " + yytext() ) ;
            }
          case 94: break;
          case 45: 
            { writeOutputFile( "KEWORD : DOWNTO : " + yytext() ) ;
            }
          case 95: break;
          case 46: 
            { writeOutputFile( "KEWORD : PROGRAM : " + yytext() ) ;
            }
          case 96: break;
          case 47: 
            { writeOutputFile( "KEWORD : GOZINEH : " + yytext() ) ;
            }
          case 97: break;
          case 48: 
            { writeOutputFile( "KEWORD : BOOLEAN : " + yytext() ) ;
            }
          case 98: break;
          case 49: 
            { writeOutputFile( "KEWORD : VAGARNA : " + yytext() ) ;
            }
          case 99: break;
          case 50: 
            { writeOutputFile( "KEWORD : BAZGASHT : " + yytext() ) ;
            }
          case 100: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java Lexer [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Lexer scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Lexer(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}