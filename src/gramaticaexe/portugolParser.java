// Generated from C:\Users\lab\Desktop\CompiladorGerador\CompiladorGerador\GramaticaExe\src\gramaticaexe\portugol.g4 by ANTLR 4.0
package gramaticaexe;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class portugolParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, VINT=2, HEXA=3, BIN=4, VREAL=5, COMENT=6, COMENT_LINHA=7, VCADEIA=8, 
		VCARACTER=9, VLOGIC=10, CONSTANTE=11, WS=12, ABP=13, FEP=14, ATB=15, ABC=16, 
		FEC=17, PEV=18, ACOL=19, FCOL=20, SIMBOL=21, EXCL=22, RESTO=23, DOISP=24, 
		VIRGULA=25, SOMA=26, SUBTRACAO=27, DIVISAO=28, MULTIPLICACAO=29, INCREMENTO=30, 
		DECREMENTO=31, MAIORIGUAL=32, MENORIGUAL=33, MULTIGUAL=34, DIVIIGUAL=35, 
		RESTOIGUAL=36, MAIOR=37, MENOR=38, MAIORI=39, MENORI=40, IGUAL=41, DIFERENTE=42, 
		E=43, OU=44, NAO=45, EBIN=46, OUBIN=47, NOTBIN=48, BINDIR=49, BINESQ=50, 
		PROGRAMA=51, REAL=52, VAZIO=53, LOGICO=54, CADEIA=55, INTEIRO=56, CARACTER=57, 
		ESCOLHA=58, CASO=59, CONTRARIO=60, CONST=61, ESCREVA=62, LIMPA=63, LEIA=64, 
		FUNCAO=65, RETORNE=66, PARA=67, PARE=68, FACA=69, ENQUANTO=70, SE=71, 
		SENAO=72, INCLUA=73, BIBLIOTECA=74, ID=75;
	public static final String[] tokenNames = {
		"<INVALID>", "'.'", "VINT", "HEXA", "BIN", "VREAL", "COMENT", "COMENT_LINHA", 
		"VCADEIA", "VCARACTER", "VLOGIC", "CONSTANTE", "WS", "'('", "')'", "'='", 
		"'{'", "'}'", "';'", "'['", "']'", "'-->'", "'!'", "'%'", "':'", "','", 
		"'+'", "'-'", "'/'", "'*'", "'++'", "'--'", "'+='", "'-='", "'*='", "'/='", 
		"'%='", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'e'", "'ou'", "'nao'", 
		"'&'", "'|'", "'~'", "'>>'", "'<<'", "'programa'", "'real'", "'vazio'", 
		"'logico'", "'cadeia'", "'inteiro'", "'caracter'", "'escolha'", "'caso'", 
		"'contrario'", "'const'", "'escreva'", "'limpa'", "'leia'", "'funcao'", 
		"'retorne'", "'para'", "'pare'", "'faca'", "'enquanto'", "'se'", "'senao'", 
		"'inclua'", "'biblioteca'", "ID"
	};
	public static final int
		RULE_prog = 0, RULE_corpo = 1, RULE_lista_decla = 2, RULE_dec_biblioteca = 3, 
		RULE_biblioteca = 4, RULE_bloco = 5, RULE_cmd = 6, RULE_dec_varl = 7, 
		RULE_list_id = 8, RULE_conteudo_exp = 9, RULE_id = 10, RULE_chamada_func = 11, 
		RULE_param = 12, RULE_addsubvariavel = 13, RULE_atrib = 14, RULE_dec_paramet = 15, 
		RULE_dec_sing = 16, RULE_dec_funcao = 17, RULE_cmd_para = 18, RULE_cmd_faca = 19, 
		RULE_cmd_enquanto = 20, RULE_cmd_se = 21, RULE_cmd_caso = 22, RULE_cmd_casocontrario = 23, 
		RULE_cmd_escolha = 24, RULE_dec_const = 25, RULE_dec_varg = 26, RULE_retorno = 27, 
		RULE_tipo = 28, RULE_valor = 29, RULE_tipoarit = 30, RULE_escreva = 31, 
		RULE_leia = 32, RULE_exp = 33, RULE_operando = 34, RULE_operador_aritmetico_secundario_concatenacao = 35, 
		RULE_operador_aritmetico_secundario = 36, RULE_operando_bit = 37, RULE_operando_soma = 38, 
		RULE_operando_sub = 39, RULE_operador_e_binario = 40, RULE_operador_ou_binario = 41, 
		RULE_operando_e = 42, RULE_operador_ou_logico = 43, RULE_idx = 44;
	public static final String[] ruleNames = {
		"prog", "corpo", "lista_decla", "dec_biblioteca", "biblioteca", "bloco", 
		"cmd", "dec_varl", "list_id", "conteudo_exp", "id", "chamada_func", "param", 
		"addsubvariavel", "atrib", "dec_paramet", "dec_sing", "dec_funcao", "cmd_para", 
		"cmd_faca", "cmd_enquanto", "cmd_se", "cmd_caso", "cmd_casocontrario", 
		"cmd_escolha", "dec_const", "dec_varg", "retorno", "tipo", "valor", "tipoarit", 
		"escreva", "leia", "exp", "operando", "operador_aritmetico_secundario_concatenacao", 
		"operador_aritmetico_secundario", "operando_bit", "operando_soma", "operando_sub", 
		"operador_e_binario", "operador_ou_binario", "operando_e", "operador_ou_logico", 
		"idx"
	};

	@Override
	public String getGrammarFileName() { return "portugol.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public portugolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode PROGRAMA() { return getToken(portugolParser.PROGRAMA, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(PROGRAMA);
			setState(91); match(ABC);
			setState(92); corpo();
			setState(93); match(FEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorpoContext extends ParserRuleContext {
		public Lista_declaContext lista_decla() {
			return getRuleContext(Lista_declaContext.class,0);
		}
		public Dec_bibliotecaContext dec_biblioteca() {
			return getRuleContext(Dec_bibliotecaContext.class,0);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitCorpo(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); dec_biblioteca();
			setState(96); lista_decla();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_declaContext extends ParserRuleContext {
		public List<Dec_vargContext> dec_varg() {
			return getRuleContexts(Dec_vargContext.class);
		}
		public Dec_funcaoContext dec_funcao(int i) {
			return getRuleContext(Dec_funcaoContext.class,i);
		}
		public List<Dec_funcaoContext> dec_funcao() {
			return getRuleContexts(Dec_funcaoContext.class);
		}
		public Dec_constContext dec_const(int i) {
			return getRuleContext(Dec_constContext.class,i);
		}
		public Dec_vargContext dec_varg(int i) {
			return getRuleContext(Dec_vargContext.class,i);
		}
		public List<Dec_constContext> dec_const() {
			return getRuleContexts(Dec_constContext.class);
		}
		public Lista_declaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_decla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterLista_decla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitLista_decla(this);
		}
	}

	public final Lista_declaContext lista_decla() throws RecognitionException {
		Lista_declaContext _localctx = new Lista_declaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lista_decla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(101);
				switch (_input.LA(1)) {
				case CONSTANTE:
					{
					setState(98); dec_const();
					}
					break;
				case REAL:
				case VAZIO:
				case LOGICO:
				case CADEIA:
				case INTEIRO:
				case CARACTER:
					{
					setState(99); dec_varg();
					}
					break;
				case FUNCAO:
					{
					setState(100); dec_funcao();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (CONSTANTE - 11)) | (1L << (REAL - 11)) | (1L << (VAZIO - 11)) | (1L << (LOGICO - 11)) | (1L << (CADEIA - 11)) | (1L << (INTEIRO - 11)) | (1L << (CARACTER - 11)) | (1L << (FUNCAO - 11)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dec_bibliotecaContext extends ParserRuleContext {
		public List<BibliotecaContext> biblioteca() {
			return getRuleContexts(BibliotecaContext.class);
		}
		public BibliotecaContext biblioteca(int i) {
			return getRuleContext(BibliotecaContext.class,i);
		}
		public Dec_bibliotecaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_biblioteca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterDec_biblioteca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitDec_biblioteca(this);
		}
	}

	public final Dec_bibliotecaContext dec_biblioteca() throws RecognitionException {
		Dec_bibliotecaContext _localctx = new Dec_bibliotecaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dec_biblioteca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INCLUA) {
				{
				{
				setState(105); biblioteca();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BibliotecaContext extends ParserRuleContext {
		public TerminalNode ID(int i) {
			return getToken(portugolParser.ID, i);
		}
		public List<TerminalNode> ID() { return getTokens(portugolParser.ID); }
		public TerminalNode BIBLIOTECA() { return getToken(portugolParser.BIBLIOTECA, 0); }
		public TerminalNode INCLUA() { return getToken(portugolParser.INCLUA, 0); }
		public BibliotecaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_biblioteca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterBiblioteca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitBiblioteca(this);
		}
	}

	public final BibliotecaContext biblioteca() throws RecognitionException {
		BibliotecaContext _localctx = new BibliotecaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_biblioteca);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); match(INCLUA);
			setState(112); match(BIBLIOTECA);
			setState(113); match(ID);
			{
			setState(114); match(SIMBOL);
			setState(115); match(ID);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloco);
		int _la;
		try {
			setState(126);
			switch (_input.LA(1)) {
			case ABC:
				enterOuterAlt(_localctx, 1);
				{
				setState(117); match(ABC);
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(118); cmd();
					}
					}
					setState(121); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (REAL - 52)) | (1L << (VAZIO - 52)) | (1L << (LOGICO - 52)) | (1L << (CADEIA - 52)) | (1L << (INTEIRO - 52)) | (1L << (CARACTER - 52)) | (1L << (ESCOLHA - 52)) | (1L << (ESCREVA - 52)) | (1L << (LIMPA - 52)) | (1L << (LEIA - 52)) | (1L << (RETORNE - 52)) | (1L << (PARA - 52)) | (1L << (FACA - 52)) | (1L << (ENQUANTO - 52)) | (1L << (SE - 52)) | (1L << (ID - 52)))) != 0) );
				setState(123); match(FEC);
				}
				break;
			case REAL:
			case VAZIO:
			case LOGICO:
			case CADEIA:
			case INTEIRO:
			case CARACTER:
			case ESCOLHA:
			case ESCREVA:
			case LIMPA:
			case LEIA:
			case RETORNE:
			case PARA:
			case FACA:
			case ENQUANTO:
			case SE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(125); cmd();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public TerminalNode LIMPA() { return getToken(portugolParser.LIMPA, 0); }
		public Cmd_seContext cmd_se() {
			return getRuleContext(Cmd_seContext.class,0);
		}
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public LeiaContext leia() {
			return getRuleContext(LeiaContext.class,0);
		}
		public EscrevaContext escreva() {
			return getRuleContext(EscrevaContext.class,0);
		}
		public Cmd_enquantoContext cmd_enquanto() {
			return getRuleContext(Cmd_enquantoContext.class,0);
		}
		public Cmd_escolhaContext cmd_escolha() {
			return getRuleContext(Cmd_escolhaContext.class,0);
		}
		public Cmd_paraContext cmd_para() {
			return getRuleContext(Cmd_paraContext.class,0);
		}
		public Cmd_facaContext cmd_faca() {
			return getRuleContext(Cmd_facaContext.class,0);
		}
		public Dec_varlContext dec_varl() {
			return getRuleContext(Dec_varlContext.class,0);
		}
		public Chamada_funcContext chamada_func() {
			return getRuleContext(Chamada_funcContext.class,0);
		}
		public TerminalNode ID() { return getToken(portugolParser.ID, 0); }
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(128); atrib();
				}
				break;

			case 2:
				{
				setState(129); dec_varl();
				}
				break;

			case 3:
				{
				setState(130); chamada_func();
				}
				break;

			case 4:
				{
				setState(131); cmd_para();
				}
				break;

			case 5:
				{
				setState(132); cmd_faca();
				}
				break;

			case 6:
				{
				setState(133); cmd_enquanto();
				}
				break;

			case 7:
				{
				setState(134); cmd_se();
				}
				break;

			case 8:
				{
				setState(135); cmd_escolha();
				}
				break;

			case 9:
				{
				setState(136); escreva();
				}
				break;

			case 10:
				{
				setState(137); match(LIMPA);
				setState(138); match(ABP);
				setState(139); match(FEP);
				}
				break;

			case 11:
				{
				setState(140); leia();
				}
				break;

			case 12:
				{
				setState(141); escreva();
				}
				break;

			case 13:
				{
				setState(142); match(ID);
				}
				break;

			case 14:
				{
				setState(143); retorno();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dec_varlContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List_idContext list_id() {
			return getRuleContext(List_idContext.class,0);
		}
		public Dec_varlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_varl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterDec_varl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitDec_varl(this);
		}
	}

	public final Dec_varlContext dec_varl() throws RecognitionException {
		Dec_varlContext _localctx = new Dec_varlContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dec_varl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); tipo();
			setState(147); list_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_idContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterList_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitList_id(this);
		}
	}

	public final List_idContext list_id() throws RecognitionException {
		List_idContext _localctx = new List_idContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_list_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); id();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(150); match(VIRGULA);
				setState(151); id();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conteudo_expContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Conteudo_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conteudo_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterConteudo_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitConteudo_exp(this);
		}
	}

	public final Conteudo_expContext conteudo_exp() throws RecognitionException {
		Conteudo_expContext _localctx = new Conteudo_expContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conteudo_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); exp(0);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(158); match(VIRGULA);
				setState(159); exp(0);
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public TerminalNode ID() { return getToken(portugolParser.ID, 0); }
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_id);
		int _la;
		try {
			int _alt;
			setState(203);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165); match(ID);
				setState(168);
				_la = _input.LA(1);
				if (_la==ATB) {
					{
					setState(166); match(ATB);
					setState(167); exp(0);
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170); match(ID);
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(171); match(ACOL);
					setState(172); match(FCOL);
					}
					}
					setState(175); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ACOL );
				setState(177); match(ATB);
				setState(178); match(ABC);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ABC) {
					{
					{
					setState(179); match(ABC);
					setState(180); valor();
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VIRGULA) {
						{
						{
						setState(181); match(VIRGULA);
						setState(182); valor();
						}
						}
						setState(187);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(188); match(FEC);
					setState(192);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					while ( _alt!=2 && _alt!=-1 ) {
						if ( _alt==1 ) {
							{
							{
							setState(189); match(VIRGULA);
							}
							} 
						}
						setState(194);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					}
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(201);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(200); match(FEC);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Chamada_funcContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Chamada_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterChamada_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitChamada_func(this);
		}
	}

	public final Chamada_funcContext chamada_func() throws RecognitionException {
		Chamada_funcContext _localctx = new Chamada_funcContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_chamada_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL) | (1L << VAZIO) | (1L << LOGICO) | (1L << CADEIA) | (1L << INTEIRO) | (1L << CARACTER))) != 0)) {
				{
				setState(205); tipo();
				}
			}

			setState(208); id();
			setState(211);
			_la = _input.LA(1);
			if (_la==1) {
				{
				setState(209); match(1);
				setState(210); id();
				}
			}

			setState(213); match(ABP);
			setState(215);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABP) | (1L << RESTO) | (1L << DIVISAO) | (1L << MULTIPLICACAO) | (1L << NAO) | (1L << NOTBIN))) != 0)) {
				{
				setState(214); param();
				}
			}

			setState(217); match(FEP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); exp(0);
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(220); match(VIRGULA);
				setState(221); exp(0);
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddsubvariavelContext extends ParserRuleContext {
		public AddsubvariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addsubvariavel; }
	 
		public AddsubvariavelContext() { }
		public void copyFrom(AddsubvariavelContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtribuicaoContext extends AddsubvariavelContext {
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public AtribuicaoContext(AddsubvariavelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitAtribuicao(this);
		}
	}
	public static class IncrementoContext extends AddsubvariavelContext {
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public IncrementoContext(AddsubvariavelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterIncremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitIncremento(this);
		}
	}
	public static class DecrementoContext extends AddsubvariavelContext {
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public DecrementoContext(AddsubvariavelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterDecremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitDecremento(this);
		}
	}

	public final AddsubvariavelContext addsubvariavel() throws RecognitionException {
		AddsubvariavelContext _localctx = new AddsubvariavelContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_addsubvariavel);
		try {
			setState(234);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new AtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(227); atrib();
				}
				break;

			case 2:
				_localctx = new IncrementoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(228); cmd();
				setState(229); match(INCREMENTO);
				}
				break;

			case 3:
				_localctx = new DecrementoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(231); cmd();
				setState(232); match(DECREMENTO);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtribContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IdxContext idx() {
			return getRuleContext(IdxContext.class,0);
		}
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitAtrib(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atrib);
		try {
			setState(254);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236); idx();
				setState(237); match(ATB);
				setState(238); exp(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240); idx();
				setState(241); match(INCREMENTO);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243); idx();
				setState(244); match(DECREMENTO);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(246); idx();
				setState(247); match(MAIORIGUAL);
				setState(248); exp(0);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(250); idx();
				setState(251); match(MENORIGUAL);
				setState(252); exp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dec_parametContext extends ParserRuleContext {
		public List<Dec_singContext> dec_sing() {
			return getRuleContexts(Dec_singContext.class);
		}
		public Dec_singContext dec_sing(int i) {
			return getRuleContext(Dec_singContext.class,i);
		}
		public Dec_parametContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_paramet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterDec_paramet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitDec_paramet(this);
		}
	}

	public final Dec_parametContext dec_paramet() throws RecognitionException {
		Dec_parametContext _localctx = new Dec_parametContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dec_paramet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256); dec_sing();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(257); match(VIRGULA);
				setState(258); dec_sing();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dec_singContext extends ParserRuleContext {
		public IdxContext idx() {
			return getRuleContext(IdxContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Dec_singContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_sing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterDec_sing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitDec_sing(this);
		}
	}

	public final Dec_singContext dec_sing() throws RecognitionException {
		Dec_singContext _localctx = new Dec_singContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dec_sing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); tipo();
			setState(266);
			_la = _input.LA(1);
			if (_la==EBIN) {
				{
				setState(265); match(EBIN);
				}
			}

			setState(268); idx();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dec_funcaoContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Dec_parametContext dec_paramet() {
			return getRuleContext(Dec_parametContext.class,0);
		}
		public TerminalNode ID() { return getToken(portugolParser.ID, 0); }
		public TerminalNode FUNCAO() { return getToken(portugolParser.FUNCAO, 0); }
		public Dec_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterDec_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitDec_funcao(this);
		}
	}

	public final Dec_funcaoContext dec_funcao() throws RecognitionException {
		Dec_funcaoContext _localctx = new Dec_funcaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dec_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); match(FUNCAO);
			setState(273);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(271); tipo();
				}
				break;

			case 2:
				{
				setState(272); match(VAZIO);
				}
				break;
			}
			setState(275); match(ID);
			setState(276); match(ABP);
			setState(278);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL) | (1L << VAZIO) | (1L << LOGICO) | (1L << CADEIA) | (1L << INTEIRO) | (1L << CARACTER))) != 0)) {
				{
				setState(277); dec_paramet();
				}
			}

			setState(280); match(FEP);
			setState(281); bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmd_paraContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AtribContext atrib(int i) {
			return getRuleContext(AtribContext.class,i);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public List<AtribContext> atrib() {
			return getRuleContexts(AtribContext.class);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode PARA() { return getToken(portugolParser.PARA, 0); }
		public Cmd_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterCmd_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitCmd_para(this);
		}
	}

	public final Cmd_paraContext cmd_para() throws RecognitionException {
		Cmd_paraContext _localctx = new Cmd_paraContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmd_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283); match(PARA);
			setState(284); match(ABP);
			setState(286);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL) | (1L << VAZIO) | (1L << LOGICO) | (1L << CADEIA) | (1L << INTEIRO) | (1L << CARACTER))) != 0)) {
				{
				setState(285); tipo();
				}
			}

			setState(288); atrib();
			setState(289); match(PEV);
			setState(290); exp(0);
			setState(291); match(PEV);
			setState(292); atrib();
			setState(293); match(FEP);
			setState(294); bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmd_facaContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(portugolParser.ENQUANTO, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FACA() { return getToken(portugolParser.FACA, 0); }
		public Cmd_facaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_faca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterCmd_faca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitCmd_faca(this);
		}
	}

	public final Cmd_facaContext cmd_faca() throws RecognitionException {
		Cmd_facaContext _localctx = new Cmd_facaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmd_faca);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296); match(FACA);
			setState(297); bloco();
			setState(298); match(ENQUANTO);
			setState(299); match(ABP);
			setState(300); exp(0);
			setState(301); match(FEP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmd_enquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(portugolParser.ENQUANTO, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FACA() { return getToken(portugolParser.FACA, 0); }
		public Cmd_enquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_enquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterCmd_enquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitCmd_enquanto(this);
		}
	}

	public final Cmd_enquantoContext cmd_enquanto() throws RecognitionException {
		Cmd_enquantoContext _localctx = new Cmd_enquantoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmd_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303); match(ENQUANTO);
			setState(304); match(ABP);
			setState(305); exp(0);
			setState(306); match(FEP);
			setState(307); match(FACA);
			setState(308); bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmd_seContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public TerminalNode SE() { return getToken(portugolParser.SE, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public TerminalNode SENAO() { return getToken(portugolParser.SENAO, 0); }
		public Cmd_seContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_se; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterCmd_se(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitCmd_se(this);
		}
	}

	public final Cmd_seContext cmd_se() throws RecognitionException {
		Cmd_seContext _localctx = new Cmd_seContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmd_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310); match(SE);
			setState(311); match(ABP);
			setState(312); exp(0);
			setState(313); match(FEP);
			setState(314); bloco();
			setState(317);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(315); match(SENAO);
				setState(316); bloco();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmd_casoContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public TerminalNode CASO() { return getToken(portugolParser.CASO, 0); }
		public TerminalNode PARE() { return getToken(portugolParser.PARE, 0); }
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public Cmd_casoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_caso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterCmd_caso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitCmd_caso(this);
		}
	}

	public final Cmd_casoContext cmd_caso() throws RecognitionException {
		Cmd_casoContext _localctx = new Cmd_casoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cmd_caso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319); match(CASO);
			setState(320); exp(0);
			setState(321); match(DOISP);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (REAL - 52)) | (1L << (VAZIO - 52)) | (1L << (LOGICO - 52)) | (1L << (CADEIA - 52)) | (1L << (INTEIRO - 52)) | (1L << (CARACTER - 52)) | (1L << (ESCOLHA - 52)) | (1L << (ESCREVA - 52)) | (1L << (LIMPA - 52)) | (1L << (LEIA - 52)) | (1L << (RETORNE - 52)) | (1L << (PARA - 52)) | (1L << (FACA - 52)) | (1L << (ENQUANTO - 52)) | (1L << (SE - 52)) | (1L << (ID - 52)))) != 0)) {
				{
				{
				setState(322); cmd();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
			_la = _input.LA(1);
			if (_la==PARE) {
				{
				setState(328); match(PARE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmd_casocontrarioContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public TerminalNode CASO() { return getToken(portugolParser.CASO, 0); }
		public TerminalNode CONTRARIO() { return getToken(portugolParser.CONTRARIO, 0); }
		public TerminalNode PARE() { return getToken(portugolParser.PARE, 0); }
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public Cmd_casocontrarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_casocontrario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterCmd_casocontrario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitCmd_casocontrario(this);
		}
	}

	public final Cmd_casocontrarioContext cmd_casocontrario() throws RecognitionException {
		Cmd_casocontrarioContext _localctx = new Cmd_casocontrarioContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cmd_casocontrario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331); match(CASO);
			setState(332); match(CONTRARIO);
			setState(333); match(DOISP);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (REAL - 52)) | (1L << (VAZIO - 52)) | (1L << (LOGICO - 52)) | (1L << (CADEIA - 52)) | (1L << (INTEIRO - 52)) | (1L << (CARACTER - 52)) | (1L << (ESCOLHA - 52)) | (1L << (ESCREVA - 52)) | (1L << (LIMPA - 52)) | (1L << (LEIA - 52)) | (1L << (RETORNE - 52)) | (1L << (PARA - 52)) | (1L << (FACA - 52)) | (1L << (ENQUANTO - 52)) | (1L << (SE - 52)) | (1L << (ID - 52)))) != 0)) {
				{
				{
				setState(334); cmd();
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341);
			_la = _input.LA(1);
			if (_la==PARE) {
				{
				setState(340); match(PARE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmd_escolhaContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public TerminalNode CASO() { return getToken(portugolParser.CASO, 0); }
		public List<Cmd_casoContext> cmd_caso() {
			return getRuleContexts(Cmd_casoContext.class);
		}
		public TerminalNode CONTRARIO() { return getToken(portugolParser.CONTRARIO, 0); }
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode ESCOLHA() { return getToken(portugolParser.ESCOLHA, 0); }
		public Cmd_casoContext cmd_caso(int i) {
			return getRuleContext(Cmd_casoContext.class,i);
		}
		public Cmd_escolhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_escolha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterCmd_escolha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitCmd_escolha(this);
		}
	}

	public final Cmd_escolhaContext cmd_escolha() throws RecognitionException {
		Cmd_escolhaContext _localctx = new Cmd_escolhaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cmd_escolha);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(343); match(ESCOLHA);
			setState(344); match(ABP);
			setState(345); exp(0);
			setState(346); match(FEP);
			setState(347); match(ABC);
			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(348); cmd_caso();
					}
					} 
				}
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(363);
			_la = _input.LA(1);
			if (_la==CASO) {
				{
				setState(354); match(CASO);
				setState(355); match(CONTRARIO);
				setState(356); match(DOISP);
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (REAL - 52)) | (1L << (VAZIO - 52)) | (1L << (LOGICO - 52)) | (1L << (CADEIA - 52)) | (1L << (INTEIRO - 52)) | (1L << (CARACTER - 52)) | (1L << (ESCOLHA - 52)) | (1L << (ESCREVA - 52)) | (1L << (LIMPA - 52)) | (1L << (LEIA - 52)) | (1L << (RETORNE - 52)) | (1L << (PARA - 52)) | (1L << (FACA - 52)) | (1L << (ENQUANTO - 52)) | (1L << (SE - 52)) | (1L << (ID - 52)))) != 0)) {
					{
					{
					setState(357); cmd();
					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(365); match(FEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dec_constContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(portugolParser.ID, 0); }
		public TerminalNode CONSTANTE() { return getToken(portugolParser.CONSTANTE, 0); }
		public Dec_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterDec_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitDec_const(this);
		}
	}

	public final Dec_constContext dec_const() throws RecognitionException {
		Dec_constContext _localctx = new Dec_constContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dec_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367); match(CONSTANTE);
			setState(368); tipo();
			setState(369); match(ID);
			setState(370); match(ATB);
			setState(371); valor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dec_vargContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(portugolParser.ID, 0); }
		public Dec_vargContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_varg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterDec_varg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitDec_varg(this);
		}
	}

	public final Dec_vargContext dec_varg() throws RecognitionException {
		Dec_vargContext _localctx = new Dec_vargContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dec_varg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373); tipo();
			setState(374); match(ID);
			setState(377);
			_la = _input.LA(1);
			if (_la==ATB) {
				{
				setState(375); match(ATB);
				setState(376); exp(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetornoContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RETORNE() { return getToken(portugolParser.RETORNE, 0); }
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); match(RETORNE);
			setState(380); exp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(portugolParser.REAL, 0); }
		public TerminalNode CARACTER() { return getToken(portugolParser.CARACTER, 0); }
		public TerminalNode CADEIA() { return getToken(portugolParser.CADEIA, 0); }
		public TerminalNode LOGICO() { return getToken(portugolParser.LOGICO, 0); }
		public TerminalNode INTEIRO() { return getToken(portugolParser.INTEIRO, 0); }
		public TerminalNode VAZIO() { return getToken(portugolParser.VAZIO, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL) | (1L << VAZIO) | (1L << LOGICO) | (1L << CADEIA) | (1L << INTEIRO) | (1L << CARACTER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode VCARACTER() { return getToken(portugolParser.VCARACTER, 0); }
		public TerminalNode VREAL() { return getToken(portugolParser.VREAL, 0); }
		public TerminalNode VLOGIC() { return getToken(portugolParser.VLOGIC, 0); }
		public TerminalNode HEXA() { return getToken(portugolParser.HEXA, 0); }
		public TerminalNode VCADEIA() { return getToken(portugolParser.VCADEIA, 0); }
		public TerminalNode BIN() { return getToken(portugolParser.BIN, 0); }
		public TerminalNode VINT() { return getToken(portugolParser.VINT, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitValor(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VINT) | (1L << HEXA) | (1L << BIN) | (1L << VREAL) | (1L << VCADEIA) | (1L << VCARACTER) | (1L << VLOGIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoaritContext extends ParserRuleContext {
		public TerminalNode MAIORI() { return getToken(portugolParser.MAIORI, 0); }
		public TerminalNode MENORI() { return getToken(portugolParser.MENORI, 0); }
		public TerminalNode MENOR() { return getToken(portugolParser.MENOR, 0); }
		public TerminalNode MAIOR() { return getToken(portugolParser.MAIOR, 0); }
		public TipoaritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoarit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterTipoarit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitTipoarit(this);
		}
	}

	public final TipoaritContext tipoarit() throws RecognitionException {
		TipoaritContext _localctx = new TipoaritContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_tipoarit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIOR) | (1L << MENOR) | (1L << MAIORI) | (1L << MENORI))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EscrevaContext extends ParserRuleContext {
		public Conteudo_expContext conteudo_exp() {
			return getRuleContext(Conteudo_expContext.class,0);
		}
		public TerminalNode ESCREVA() { return getToken(portugolParser.ESCREVA, 0); }
		public EscrevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escreva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitEscreva(this);
		}
	}

	public final EscrevaContext escreva() throws RecognitionException {
		EscrevaContext _localctx = new EscrevaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_escreva);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388); match(ESCREVA);
			setState(389); match(ABP);
			setState(390); conteudo_exp();
			setState(391); match(FEP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeiaContext extends ParserRuleContext {
		public List<IdxContext> idx() {
			return getRuleContexts(IdxContext.class);
		}
		public TerminalNode LEIA() { return getToken(portugolParser.LEIA, 0); }
		public IdxContext idx(int i) {
			return getRuleContext(IdxContext.class,i);
		}
		public LeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitLeia(this);
		}
	}

	public final LeiaContext leia() throws RecognitionException {
		LeiaContext _localctx = new LeiaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_leia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393); match(LEIA);
			setState(394); match(ABP);
			setState(395); idx();
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(396); match(VIRGULA);
				setState(397); idx();
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(403); match(FEP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public int _p;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public Operando_eContext operando_e() {
			return getRuleContext(Operando_eContext.class,0);
		}
		public Operador_e_binarioContext operador_e_binario() {
			return getRuleContext(Operador_e_binarioContext.class,0);
		}
		public Operando_subContext operando_sub() {
			return getRuleContext(Operando_subContext.class,0);
		}
		public Operador_ou_binarioContext operador_ou_binario() {
			return getRuleContext(Operador_ou_binarioContext.class,0);
		}
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public TerminalNode NAO() { return getToken(portugolParser.NAO, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Operando_somaContext operando_soma() {
			return getRuleContext(Operando_somaContext.class,0);
		}
		public Operando_bitContext operando_bit() {
			return getRuleContext(Operando_bitContext.class,0);
		}
		public Operador_ou_logicoContext operador_ou_logico() {
			return getRuleContext(Operador_ou_logicoContext.class,0);
		}
		public TerminalNode NOTBIN() { return getToken(portugolParser.NOTBIN, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState, _p);
		ExpContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, RULE_exp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			switch (_input.LA(1)) {
			case NAO:
			case NOTBIN:
				{
				setState(406);
				_la = _input.LA(1);
				if ( !(_la==NAO || _la==NOTBIN) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(407); match(ABP);
				setState(408); exp(0);
				setState(409); match(FEP);
				}
				break;
			case RESTO:
			case DIVISAO:
			case MULTIPLICACAO:
				{
				setState(411); operando();
				}
				break;
			case ABP:
				{
				setState(412); match(ABP);
				setState(413); exp(0);
				setState(414); match(FEP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(452);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(450);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(418);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(419); operando();
						setState(420); exp(0);
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(422);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(423); operando_bit();
						setState(424); exp(0);
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(426);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(427); operando_soma();
						setState(428); exp(0);
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(430);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(431); operando_sub();
						setState(432); exp(0);
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(434);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(435); operador_e_binario();
						setState(436); exp(0);
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(438);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(439); operador_ou_binario();
						setState(440); exp(0);
						}
						break;

					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(442);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(443); operando_e();
						setState(444); exp(0);
						}
						break;

					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(446);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(447); operador_ou_logico();
						setState(448); exp(0);
						}
						break;
					}
					} 
				}
				setState(454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OperandoContext extends ParserRuleContext {
		public OperandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterOperando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitOperando(this);
		}
	}

	public final OperandoContext operando() throws RecognitionException {
		OperandoContext _localctx = new OperandoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_operando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RESTO) | (1L << DIVISAO) | (1L << MULTIPLICACAO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operador_aritmetico_secundario_concatenacaoContext extends ParserRuleContext {
		public Operador_aritmetico_secundario_concatenacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_aritmetico_secundario_concatenacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterOperador_aritmetico_secundario_concatenacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitOperador_aritmetico_secundario_concatenacao(this);
		}
	}

	public final Operador_aritmetico_secundario_concatenacaoContext operador_aritmetico_secundario_concatenacao() throws RecognitionException {
		Operador_aritmetico_secundario_concatenacaoContext _localctx = new Operador_aritmetico_secundario_concatenacaoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_operador_aritmetico_secundario_concatenacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457); match(SOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operador_aritmetico_secundarioContext extends ParserRuleContext {
		public Operador_aritmetico_secundarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_aritmetico_secundario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterOperador_aritmetico_secundario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitOperador_aritmetico_secundario(this);
		}
	}

	public final Operador_aritmetico_secundarioContext operador_aritmetico_secundario() throws RecognitionException {
		Operador_aritmetico_secundarioContext _localctx = new Operador_aritmetico_secundarioContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_operador_aritmetico_secundario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459); match(SUBTRACAO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operando_bitContext extends ParserRuleContext {
		public Operando_bitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando_bit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterOperando_bit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitOperando_bit(this);
		}
	}

	public final Operando_bitContext operando_bit() throws RecognitionException {
		Operando_bitContext _localctx = new Operando_bitContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_operando_bit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_la = _input.LA(1);
			if ( !(_la==BINDIR || _la==BINESQ) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operando_somaContext extends ParserRuleContext {
		public Operando_somaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando_soma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterOperando_soma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitOperando_soma(this);
		}
	}

	public final Operando_somaContext operando_soma() throws RecognitionException {
		Operando_somaContext _localctx = new Operando_somaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_operando_soma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAIOR) | (1L << MENOR) | (1L << MAIORI) | (1L << MENORI))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operando_subContext extends ParserRuleContext {
		public Operando_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterOperando_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitOperando_sub(this);
		}
	}

	public final Operando_subContext operando_sub() throws RecognitionException {
		Operando_subContext _localctx = new Operando_subContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_operando_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_la = _input.LA(1);
			if ( !(_la==IGUAL || _la==DIFERENTE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operador_e_binarioContext extends ParserRuleContext {
		public Operador_e_binarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_e_binario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterOperador_e_binario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitOperador_e_binario(this);
		}
	}

	public final Operador_e_binarioContext operador_e_binario() throws RecognitionException {
		Operador_e_binarioContext _localctx = new Operador_e_binarioContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_operador_e_binario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(467); match(EBIN);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operador_ou_binarioContext extends ParserRuleContext {
		public Operador_ou_binarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_ou_binario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterOperador_ou_binario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitOperador_ou_binario(this);
		}
	}

	public final Operador_ou_binarioContext operador_ou_binario() throws RecognitionException {
		Operador_ou_binarioContext _localctx = new Operador_ou_binarioContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_operador_ou_binario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(469); match(OUBIN);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operando_eContext extends ParserRuleContext {
		public Operando_eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterOperando_e(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitOperando_e(this);
		}
	}

	public final Operando_eContext operando_e() throws RecognitionException {
		Operando_eContext _localctx = new Operando_eContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_operando_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(471); match(E);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operador_ou_logicoContext extends ParserRuleContext {
		public Operador_ou_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_ou_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterOperador_ou_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitOperador_ou_logico(this);
		}
	}

	public final Operador_ou_logicoContext operador_ou_logico() throws RecognitionException {
		Operador_ou_logicoContext _localctx = new Operador_ou_logicoContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_operador_ou_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(473); match(OU);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdxContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode ID() { return getToken(portugolParser.ID, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public IdxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).enterIdx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof portugolListener ) ((portugolListener)listener).exitIdx(this);
		}
	}

	public final IdxContext idx() throws RecognitionException {
		IdxContext _localctx = new IdxContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_idx);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475); match(ID);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACOL) {
				{
				{
				setState(476); match(ACOL);
				setState(477); exp(0);
				setState(478); match(FCOL);
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 33: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 10 >= _localctx._p;

		case 1: return 9 >= _localctx._p;

		case 2: return 8 >= _localctx._p;

		case 3: return 7 >= _localctx._p;

		case 4: return 6 >= _localctx._p;

		case 5: return 5 >= _localctx._p;

		case 6: return 4 >= _localctx._p;

		case 7: return 3 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3M\u01e8\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\6\4h\n\4\r\4\16\4i\3\5\7\5m\n\5\f\5\16\5p\13\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\6\7z\n\7\r\7\16\7{\3\7\3\7\3\7\5\7\u0081\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0093\n"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u009b\n\n\f\n\16\n\u009e\13\n\3\13\3\13"+
		"\3\13\7\13\u00a3\n\13\f\13\16\13\u00a6\13\13\3\f\3\f\3\f\5\f\u00ab\n\f"+
		"\3\f\3\f\3\f\6\f\u00b0\n\f\r\f\16\f\u00b1\3\f\3\f\3\f\3\f\3\f\3\f\7\f"+
		"\u00ba\n\f\f\f\16\f\u00bd\13\f\3\f\3\f\7\f\u00c1\n\f\f\f\16\f\u00c4\13"+
		"\f\7\f\u00c6\n\f\f\f\16\f\u00c9\13\f\3\f\5\f\u00cc\n\f\5\f\u00ce\n\f\3"+
		"\r\5\r\u00d1\n\r\3\r\3\r\3\r\5\r\u00d6\n\r\3\r\3\r\5\r\u00da\n\r\3\r\3"+
		"\r\3\16\3\16\3\16\7\16\u00e1\n\16\f\16\16\16\u00e4\13\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00ed\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0101\n\20"+
		"\3\21\3\21\3\21\7\21\u0106\n\21\f\21\16\21\u0109\13\21\3\22\3\22\5\22"+
		"\u010d\n\22\3\22\3\22\3\23\3\23\3\23\5\23\u0114\n\23\3\23\3\23\3\23\5"+
		"\23\u0119\n\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u0121\n\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u0140\n\27\3\30\3\30\3\30\3\30\7\30\u0146\n\30\f\30\16\30\u0149\13\30"+
		"\3\30\5\30\u014c\n\30\3\31\3\31\3\31\3\31\7\31\u0152\n\31\f\31\16\31\u0155"+
		"\13\31\3\31\5\31\u0158\n\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0160\n"+
		"\32\f\32\16\32\u0163\13\32\3\32\3\32\3\32\3\32\7\32\u0169\n\32\f\32\16"+
		"\32\u016c\13\32\5\32\u016e\n\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\5\34\u017c\n\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\7\"\u0191\n\"\f\"\16\"\u0194"+
		"\13\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01a3\n#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\7#\u01c5\n#\f#\16#\u01c8\13#\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3.\3.\7.\u01e3\n.\f.\16"+
		".\u01e6\13.\3.\2/\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\2\n\3\66;\4\4\7\n\f\3\'*\4//\62\62\4\31\31\36"+
		"\37\3\63\64\3\'*\3+,\u01fb\2\\\3\2\2\2\4a\3\2\2\2\6g\3\2\2\2\bn\3\2\2"+
		"\2\nq\3\2\2\2\f\u0080\3\2\2\2\16\u0092\3\2\2\2\20\u0094\3\2\2\2\22\u0097"+
		"\3\2\2\2\24\u009f\3\2\2\2\26\u00cd\3\2\2\2\30\u00d0\3\2\2\2\32\u00dd\3"+
		"\2\2\2\34\u00ec\3\2\2\2\36\u0100\3\2\2\2 \u0102\3\2\2\2\"\u010a\3\2\2"+
		"\2$\u0110\3\2\2\2&\u011d\3\2\2\2(\u012a\3\2\2\2*\u0131\3\2\2\2,\u0138"+
		"\3\2\2\2.\u0141\3\2\2\2\60\u014d\3\2\2\2\62\u0159\3\2\2\2\64\u0171\3\2"+
		"\2\2\66\u0177\3\2\2\28\u017d\3\2\2\2:\u0180\3\2\2\2<\u0182\3\2\2\2>\u0184"+
		"\3\2\2\2@\u0186\3\2\2\2B\u018b\3\2\2\2D\u01a2\3\2\2\2F\u01c9\3\2\2\2H"+
		"\u01cb\3\2\2\2J\u01cd\3\2\2\2L\u01cf\3\2\2\2N\u01d1\3\2\2\2P\u01d3\3\2"+
		"\2\2R\u01d5\3\2\2\2T\u01d7\3\2\2\2V\u01d9\3\2\2\2X\u01db\3\2\2\2Z\u01dd"+
		"\3\2\2\2\\]\7\65\2\2]^\7\22\2\2^_\5\4\3\2_`\7\23\2\2`\3\3\2\2\2ab\5\b"+
		"\5\2bc\5\6\4\2c\5\3\2\2\2dh\5\64\33\2eh\5\66\34\2fh\5$\23\2gd\3\2\2\2"+
		"ge\3\2\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\7\3\2\2\2km\5\n\6"+
		"\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\t\3\2\2\2pn\3\2\2\2qr\7K\2"+
		"\2rs\7L\2\2st\7M\2\2tu\7\27\2\2uv\7M\2\2v\13\3\2\2\2wy\7\22\2\2xz\5\16"+
		"\b\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\23\2\2~\u0081"+
		"\3\2\2\2\177\u0081\5\16\b\2\u0080w\3\2\2\2\u0080\177\3\2\2\2\u0081\r\3"+
		"\2\2\2\u0082\u0093\5\36\20\2\u0083\u0093\5\20\t\2\u0084\u0093\5\30\r\2"+
		"\u0085\u0093\5&\24\2\u0086\u0093\5(\25\2\u0087\u0093\5*\26\2\u0088\u0093"+
		"\5,\27\2\u0089\u0093\5\62\32\2\u008a\u0093\5@!\2\u008b\u008c\7A\2\2\u008c"+
		"\u008d\7\17\2\2\u008d\u0093\7\20\2\2\u008e\u0093\5B\"\2\u008f\u0093\5"+
		"@!\2\u0090\u0093\7M\2\2\u0091\u0093\58\35\2\u0092\u0082\3\2\2\2\u0092"+
		"\u0083\3\2\2\2\u0092\u0084\3\2\2\2\u0092\u0085\3\2\2\2\u0092\u0086\3\2"+
		"\2\2\u0092\u0087\3\2\2\2\u0092\u0088\3\2\2\2\u0092\u0089\3\2\2\2\u0092"+
		"\u008a\3\2\2\2\u0092\u008b\3\2\2\2\u0092\u008e\3\2\2\2\u0092\u008f\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\17\3\2\2\2\u0094\u0095"+
		"\5:\36\2\u0095\u0096\5\22\n\2\u0096\21\3\2\2\2\u0097\u009c\5\26\f\2\u0098"+
		"\u0099\7\33\2\2\u0099\u009b\5\26\f\2\u009a\u0098\3\2\2\2\u009b\u009e\3"+
		"\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\23\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\u00a4\5D#\2\u00a0\u00a1\7\33\2\2\u00a1\u00a3\5D#"+
		"\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\25\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\7M\2\2\u00a8"+
		"\u00a9\7\21\2\2\u00a9\u00ab\5D#\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ce\3\2\2\2\u00ac\u00af\7M\2\2\u00ad\u00ae\7\25\2\2\u00ae"+
		"\u00b0\7\26\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00af\3"+
		"\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\21\2\2\u00b4"+
		"\u00c7\7\22\2\2\u00b5\u00b6\7\22\2\2\u00b6\u00bb\5<\37\2\u00b7\u00b8\7"+
		"\33\2\2\u00b8\u00ba\5<\37\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00be\u00c2\7\23\2\2\u00bf\u00c1\7\33\2\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c6\3\2"+
		"\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00b5\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00ca\u00cc\7\23\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00ce\3\2\2\2\u00cd\u00a7\3\2\2\2\u00cd\u00ac\3\2\2\2\u00ce\27\3\2\2"+
		"\2\u00cf\u00d1\5:\36\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\u00d5\5\26\f\2\u00d3\u00d4\7\3\2\2\u00d4\u00d6\5\26\f\2"+
		"\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9"+
		"\7\17\2\2\u00d8\u00da\5\32\16\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2"+
		"\2\u00da\u00db\3\2\2\2\u00db\u00dc\7\20\2\2\u00dc\31\3\2\2\2\u00dd\u00e2"+
		"\5D#\2\u00de\u00df\7\33\2\2\u00df\u00e1\5D#\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\33\3\2\2"+
		"\2\u00e4\u00e2\3\2\2\2\u00e5\u00ed\5\36\20\2\u00e6\u00e7\5\16\b\2\u00e7"+
		"\u00e8\7 \2\2\u00e8\u00ed\3\2\2\2\u00e9\u00ea\5\16\b\2\u00ea\u00eb\7!"+
		"\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00e5\3\2\2\2\u00ec\u00e6\3\2\2\2\u00ec"+
		"\u00e9\3\2\2\2\u00ed\35\3\2\2\2\u00ee\u00ef\5Z.\2\u00ef\u00f0\7\21\2\2"+
		"\u00f0\u00f1\5D#\2\u00f1\u0101\3\2\2\2\u00f2\u00f3\5Z.\2\u00f3\u00f4\7"+
		" \2\2\u00f4\u0101\3\2\2\2\u00f5\u00f6\5Z.\2\u00f6\u00f7\7!\2\2\u00f7\u0101"+
		"\3\2\2\2\u00f8\u00f9\5Z.\2\u00f9\u00fa\7\"\2\2\u00fa\u00fb\5D#\2\u00fb"+
		"\u0101\3\2\2\2\u00fc\u00fd\5Z.\2\u00fd\u00fe\7#\2\2\u00fe\u00ff\5D#\2"+
		"\u00ff\u0101\3\2\2\2\u0100\u00ee\3\2\2\2\u0100\u00f2\3\2\2\2\u0100\u00f5"+
		"\3\2\2\2\u0100\u00f8\3\2\2\2\u0100\u00fc\3\2\2\2\u0101\37\3\2\2\2\u0102"+
		"\u0107\5\"\22\2\u0103\u0104\7\33\2\2\u0104\u0106\5\"\22\2\u0105\u0103"+
		"\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"!\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010c\5:\36\2\u010b\u010d\7\60\2\2"+
		"\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f"+
		"\5Z.\2\u010f#\3\2\2\2\u0110\u0113\7C\2\2\u0111\u0114\5:\36\2\u0112\u0114"+
		"\7\67\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2"+
		"\u0114\u0115\3\2\2\2\u0115\u0116\7M\2\2\u0116\u0118\7\17\2\2\u0117\u0119"+
		"\5 \21\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011b\7\20\2\2\u011b\u011c\5\f\7\2\u011c%\3\2\2\2\u011d\u011e\7E\2\2"+
		"\u011e\u0120\7\17\2\2\u011f\u0121\5:\36\2\u0120\u011f\3\2\2\2\u0120\u0121"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\5\36\20\2\u0123\u0124\7\24\2"+
		"\2\u0124\u0125\5D#\2\u0125\u0126\7\24\2\2\u0126\u0127\5\36\20\2\u0127"+
		"\u0128\7\20\2\2\u0128\u0129\5\f\7\2\u0129\'\3\2\2\2\u012a\u012b\7G\2\2"+
		"\u012b\u012c\5\f\7\2\u012c\u012d\7H\2\2\u012d\u012e\7\17\2\2\u012e\u012f"+
		"\5D#\2\u012f\u0130\7\20\2\2\u0130)\3\2\2\2\u0131\u0132\7H\2\2\u0132\u0133"+
		"\7\17\2\2\u0133\u0134\5D#\2\u0134\u0135\7\20\2\2\u0135\u0136\7G\2\2\u0136"+
		"\u0137\5\f\7\2\u0137+\3\2\2\2\u0138\u0139\7I\2\2\u0139\u013a\7\17\2\2"+
		"\u013a\u013b\5D#\2\u013b\u013c\7\20\2\2\u013c\u013f\5\f\7\2\u013d\u013e"+
		"\7J\2\2\u013e\u0140\5\f\7\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"-\3\2\2\2\u0141\u0142\7=\2\2\u0142\u0143\5D#\2\u0143\u0147\7\32\2\2\u0144"+
		"\u0146\5\16\b\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3"+
		"\2\2\2\u0147\u0148\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u014a"+
		"\u014c\7F\2\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c/\3\2\2\2\u014d"+
		"\u014e\7=\2\2\u014e\u014f\7>\2\2\u014f\u0153\7\32\2\2\u0150\u0152\5\16"+
		"\b\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0158\7F"+
		"\2\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\61\3\2\2\2\u0159\u015a"+
		"\7<\2\2\u015a\u015b\7\17\2\2\u015b\u015c\5D#\2\u015c\u015d\7\20\2\2\u015d"+
		"\u0161\7\22\2\2\u015e\u0160\5.\30\2\u015f\u015e\3\2\2\2\u0160\u0163\3"+
		"\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u016d\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0164\u0165\7=\2\2\u0165\u0166\7>\2\2\u0166\u016a\7\32"+
		"\2\2\u0167\u0169\5\16\b\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2"+
		"\2\2\u016d\u0164\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0170\7\23\2\2\u0170\63\3\2\2\2\u0171\u0172\7\r\2\2\u0172\u0173\5:\36"+
		"\2\u0173\u0174\7M\2\2\u0174\u0175\7\21\2\2\u0175\u0176\5<\37\2\u0176\65"+
		"\3\2\2\2\u0177\u0178\5:\36\2\u0178\u017b\7M\2\2\u0179\u017a\7\21\2\2\u017a"+
		"\u017c\5D#\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\67\3\2\2\2"+
		"\u017d\u017e\7D\2\2\u017e\u017f\5D#\2\u017f9\3\2\2\2\u0180\u0181\t\2\2"+
		"\2\u0181;\3\2\2\2\u0182\u0183\t\3\2\2\u0183=\3\2\2\2\u0184\u0185\t\4\2"+
		"\2\u0185?\3\2\2\2\u0186\u0187\7@\2\2\u0187\u0188\7\17\2\2\u0188\u0189"+
		"\5\24\13\2\u0189\u018a\7\20\2\2\u018aA\3\2\2\2\u018b\u018c\7B\2\2\u018c"+
		"\u018d\7\17\2\2\u018d\u0192\5Z.\2\u018e\u018f\7\33\2\2\u018f\u0191\5Z"+
		".\2\u0190\u018e\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0196\7\20"+
		"\2\2\u0196C\3\2\2\2\u0197\u0198\b#\1\2\u0198\u0199\t\5\2\2\u0199\u019a"+
		"\7\17\2\2\u019a\u019b\5D#\2\u019b\u019c\7\20\2\2\u019c\u01a3\3\2\2\2\u019d"+
		"\u01a3\5F$\2\u019e\u019f\7\17\2\2\u019f\u01a0\5D#\2\u01a0\u01a1\7\20\2"+
		"\2\u01a1\u01a3\3\2\2\2\u01a2\u0197\3\2\2\2\u01a2\u019d\3\2\2\2\u01a2\u019e"+
		"\3\2\2\2\u01a3\u01c6\3\2\2\2\u01a4\u01a5\6#\2\3\u01a5\u01a6\5F$\2\u01a6"+
		"\u01a7\5D#\2\u01a7\u01c5\3\2\2\2\u01a8\u01a9\6#\3\3\u01a9\u01aa\5L\'\2"+
		"\u01aa\u01ab\5D#\2\u01ab\u01c5\3\2\2\2\u01ac\u01ad\6#\4\3\u01ad\u01ae"+
		"\5N(\2\u01ae\u01af\5D#\2\u01af\u01c5\3\2\2\2\u01b0\u01b1\6#\5\3\u01b1"+
		"\u01b2\5P)\2\u01b2\u01b3\5D#\2\u01b3\u01c5\3\2\2\2\u01b4\u01b5\6#\6\3"+
		"\u01b5\u01b6\5R*\2\u01b6\u01b7\5D#\2\u01b7\u01c5\3\2\2\2\u01b8\u01b9\6"+
		"#\7\3\u01b9\u01ba\5T+\2\u01ba\u01bb\5D#\2\u01bb\u01c5\3\2\2\2\u01bc\u01bd"+
		"\6#\b\3\u01bd\u01be\5V,\2\u01be\u01bf\5D#\2\u01bf\u01c5\3\2\2\2\u01c0"+
		"\u01c1\6#\t\3\u01c1\u01c2\5X-\2\u01c2\u01c3\5D#\2\u01c3\u01c5\3\2\2\2"+
		"\u01c4\u01a4\3\2\2\2\u01c4\u01a8\3\2\2\2\u01c4\u01ac\3\2\2\2\u01c4\u01b0"+
		"\3\2\2\2\u01c4\u01b4\3\2\2\2\u01c4\u01b8\3\2\2\2\u01c4\u01bc\3\2\2\2\u01c4"+
		"\u01c0\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2"+
		"\2\2\u01c7E\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\t\6\2\2\u01caG\3\2"+
		"\2\2\u01cb\u01cc\7\34\2\2\u01ccI\3\2\2\2\u01cd\u01ce\7\35\2\2\u01ceK\3"+
		"\2\2\2\u01cf\u01d0\t\7\2\2\u01d0M\3\2\2\2\u01d1\u01d2\t\b\2\2\u01d2O\3"+
		"\2\2\2\u01d3\u01d4\t\t\2\2\u01d4Q\3\2\2\2\u01d5\u01d6\7\60\2\2\u01d6S"+
		"\3\2\2\2\u01d7\u01d8\7\61\2\2\u01d8U\3\2\2\2\u01d9\u01da\7-\2\2\u01da"+
		"W\3\2\2\2\u01db\u01dc\7.\2\2\u01dcY\3\2\2\2\u01dd\u01e4\7M\2\2\u01de\u01df"+
		"\7\25\2\2\u01df\u01e0\5D#\2\u01e0\u01e1\7\26\2\2\u01e1\u01e3\3\2\2\2\u01e2"+
		"\u01de\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2"+
		"\2\2\u01e5[\3\2\2\2\u01e6\u01e4\3\2\2\2*gin{\u0080\u0092\u009c\u00a4\u00aa"+
		"\u00b1\u00bb\u00c2\u00c7\u00cb\u00cd\u00d0\u00d5\u00d9\u00e2\u00ec\u0100"+
		"\u0107\u010c\u0113\u0118\u0120\u013f\u0147\u014b\u0153\u0157\u0161\u016a"+
		"\u016d\u017b\u0192\u01a2\u01c4\u01c6\u01e4";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}