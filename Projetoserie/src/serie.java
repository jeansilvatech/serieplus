import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.ResultSet;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;


public class serie extends JFrame {

	private JPanel contentPane;
	private manipulaserie ser=new manipulaserie();
	ResultSet resultado=ser.listagem();
	ResultSet resultado1=ser.listagemarrow();

	/**-------------------------------------Panel Series-----------------------------**/
	public static JPanel panelarrow = new JPanel();
	public static JPanel panelflash = new JPanel();
	public static JPanel panelsupergirl = new JPanel();
	public static JPanel panellegends = new JPanel();
	public static JPanel paneldemolidor = new JPanel();
	public static JPanel panelgrimm = new JPanel();
	public static JPanel panelgot = new JPanel();
	public static JPanel panelsupernatural = new JPanel();
	public static JPanel panelthe100 = new JPanel();
	public static JPanel panelgotham = new JPanel();
	public static JPanel paneltwd = new JPanel();
	public static JPanel panelrobot = new JPanel();
	
	
	
	
	/**-------------------------------------Botões ASSISTIDO-----------------------------**/
	JButton jbAssistiArrow = new JButton("Assistido");
	JButton jbAssistiFlash = new JButton("Assistido");
	JButton jbAssistiSuper = new JButton("Assistido");
	JButton jbAssistiLegends = new JButton("Assistido");
	JButton jbAssistiDemolidor = new JButton("Assistido");
	JButton jbAssistiGrimm = new JButton("Assistido");
	
	/**-------------------------------------ComboBox Episodios-----------------------------**/
	JComboBox jcbEpisodioA = new JComboBox();
	JComboBox jcbEpisodioF = new JComboBox();
	JComboBox jcbEpisodioS = new JComboBox();
	JComboBox jcbEpisodioL = new JComboBox();
	JComboBox jcbEpisodioD = new JComboBox();
	JComboBox jcbEpisodioG = new JComboBox();
	JComboBox jcbEpisodioSPN = new JComboBox();
	JComboBox jcbEpisodioThe100 = new JComboBox();
	JComboBox jcbEpisodioGOT = new JComboBox();
	
	/**-------------------------------------ComboBox Temporada-----------------------------**/
	JComboBox jcbTemporadaA = new JComboBox();
	JComboBox jcbTemporadaF = new JComboBox();
	JComboBox jcbTemporadaS = new JComboBox();
	JComboBox jcbTemporadaL = new JComboBox();
	JComboBox jcbTemporadaD = new JComboBox();
	JComboBox jcbTemporadaG = new JComboBox();
	JComboBox jcbTemporadaGotham = new JComboBox();
	JComboBox jcbTemporadaSPN = new JComboBox();
	JComboBox jcbTemporadaGOT = new JComboBox();
	JComboBox jcbTemporadaThe100 = new JComboBox();
	
	JLabel flash = new JLabel("");
	JLabel jlLogo = new JLabel("");
	JLabel jlFundoArrow = new JLabel ("");
	
	/**-------------------------------------JInternalFrames-----------------------------**/
	public static tabelaserie tab = new tabelaserie();
	public static serie2 ser2 = new serie2();
	
	/**-------------------------------------Nomes Series-----------------------------**/
	JLabel jlTheFlash = new JLabel("The Flash");
	JLabel jlSupergirl = new JLabel("Supergirl");
	JLabel jlLegends = new JLabel("Legends of Tomorrow");
	JLabel jlDemolidor = new JLabel("Demolidor");
	JLabel jlGrimm = new JLabel("Grimm");
	JLabel jlArrow = new JLabel("Arrow");
	JLabel jlGOT = new JLabel("Game of Thrones");
	JLabel jlSPN = new JLabel("Supernatural");
	JLabel jlGotham = new JLabel("Gotham");
	JLabel jlMrRobot = new JLabel("Mr. Robot");
	JLabel jlTWD = new JLabel("The Walking Dead");
	JLabel jlThe100 = new JLabel("The 100");
	
	JLabel jlA = new JLabel("");
	JLabel jlF = new JLabel("");
	JLabel jlS = new JLabel("");
	JLabel jlL = new JLabel("");
	JLabel jlD = new JLabel("");
	JLabel jlG = new JLabel("");
	
	JLabel jlResumoArrow = new JLabel("<html><center> RESUMO</center> <br/><br/>Playboy, milionário e mulherengo, Oliver Queen (Stephen Amell) está presumivelmente <br/>morto há 5 anos, quando um acidente de iate causou o desaparecimento dele, de seu pai,<br/> Robert (Jamey Sheridan), e Sara Lance, irmã de sua então namorada Laurel (Katie<br/> Cassidy). Mas Ollie sobreviveu e, preso em uma ilha, ele aprendeu a lutar por sua vida.<br/> De volta à civilização em Starling City, ele é um homem mudado e está decidido a honrar<br/> a memória do pai e livrar a cidade da corrupção. Disfarçado, ele usa as habilidades que<br/> aprendeu durante seu tempo de reclusão para isso, e ao mesmo tempo precisa esconder<br/> sua nova identidade da mãe, Moira (Susanna Thompson), da irmã, Thea (Willa Holland) e<br/> dos amigos.</html>");
	JLabel jlResumoFlash = new JLabel("<html><center> RESUMO</center> <br/><br/>Barry Allen (Grant Gustin) era um funcionário da Polícia Científica que, ao sofrer um<br/> acidente, foi banhado por produtos químicos em seu laboratório e, em seguida, atingido<br/> por um raio. Foi a partir disso que ele começou a ser capaz de canalizar os poderes<br/> vindos do Campo de Velocidade, e se locomover em altíssimas velocidades. Usando<br/> uma máscara e um uniforme vermelho, ele começa a usar suas habilidades para patrulhar<br/> Central City com a ajuda dos cientistas da S.T.A.R. Labs, e detém vilões ao mesmo tempo<br/> em que procura descobrir quem foi o assassino de sua mãe.");
	JLabel jlResumoSupergirl = new JLabel ("<html><center> RESUMO</center> <br/><br/>Após escapar de seu planeta, Krypton, durante sua destruição há anos atrás, Kara Zor-El adotou o nome de Kara Danvers quando chegou a Terra. ... Agora que está adulta, Kara decide assumir suas habilidades inacreditáveis e ser a heroína que sempre foi destinada a ser, a Supergirl.");
	JLabel jlResumoLegends = new JLabel ("<html><center> RESUMO</center> <br/><br/>Em Legends of Tomorrow, quando heróis sozinhos não são o suficiente… o mundo precisa de lendas. Já tendo visto o futuro, um deles irá desesperadamente tentar impedi-lo de acontecer.");
	JLabel jlResumoDemolidor = new JLabel ("<html><center> RESUMO</center> <br/><br/>Advogado durante o dia, Matt Murdock usa à noite seus sentidos aguçados, adquiridos em um acidente na infância que lhe deixou cego, para combater o crime nas ruas de Hell's Kitchen, bairro onde cresceu em Nova York.");
	JLabel jlResumoGrimm = new JLabel ("<html><center> RESUMO</center> <br/><br/>Nick Burkhardt (David Giuntoli) é um detetive de homicídios que recebe novas responsabilidades após descobrir que é descendente de Grimm, uma sociedade secreta. O seu principal objetivo é conseguir encontrar um ponto de equilíbrio entre a vida real e a mitologia.");
	JLabel jlResumoGOT = new JLabel ("<html><center> RESUMO</center> <br/><br/>Game of Thrones conta a históra de um lugar onde uma força destruiu o equilíbrio das estações, há muito tempo. Em uma terra onde os verões podem durar vários anos e o inverno toda uma vida, as reivindicações e as forças sobrenaturais correm as portas do Reino dos Sete Reinos.");
	JLabel jlResumoSPN = new JLabel ("<html><center> RESUMO</center> <br/><br/>A série segue os irmãos Sam e Dean Winchester enquanto procuram por seu pai, John, que está caçando o demônio que matou a mãe deles e a namorada de Sam. Durante suas viagens, eles usam o diário de seu pai para ajudá-los a continuar o negócio da família—salvar pessoas e caçar criaturas sobrenaturais.");
	JLabel jlResumoGotham = new JLabel ("<html><center> RESUMO</center> <br/><br/>Antes de Batman, a cidade de Gotham já existia. James Gordon (Ben McKenzie) é um detetive iniciante polícia. Corajoso, sincero e ansioso para mostrar serviço, o recém-promovido tem como missão solucionar o caso do assassinato dos bilionários Thomas e Martha Wayne, um dos casos mais complexos da cidade. Com seu parceiro, o oficial Harvey Bullock (Donal Logue), Gordon conhece o único sobrevivente do assassinato: Bruce (David Mazuouz), um garoto de 12 anos, filho do casal, por quem ele imediatamente sente uma grande afeição.");
	JLabel jlResumoMrRobot = new JLabel ("<html><center> RESUMO</center> <br/><br/>Elliot (Rami Malek) é um jovem programador que trabalha como engenheiro de segurança virtual durante o dia, e como hacker vigilante durante a noite. Elliot se vê numa encruzilhada quando o líder (Christian Slater) de um misterioso grupo de hacker o recruta para destruir a firma que ele é pago para proteger.");
	JLabel jlResumoTWD = new JLabel ("<html><center> RESUMO</center> <br/><br/>The Walking Dead é centrado em Rick Grimes, um oficial de polícia de uma cidade no estado da Geórgia, Estados Unidos. Também acompanha a trajetória de sua família e uma série de outros sobreviventes que se uniram para manterem-se vivos depois que o mundo foi infestado por zumbis.");
	JLabel jlResumoThe100 = new JLabel ("<html><center> RESUMO</center> <br/><br/>Em The 100, quando uma guerra nuclear destruiu a civilização e o planeta Terra, os únicos sobreviventes foram 400 pessoas que estavam em 12 estações espaciais em órbita. 97 anos e três gerações depois, a população já contava com 4 mil pessoas, mas os recursos já vão escassos. Para garantir o futuro, um grupo de cem jovens é enviado à superfície da Terra para descobrir se ela está habitável. Com a sobrevivência da raça humana em suas mãos, estes jovens precisam superar suas diferenças e unir forças para cruzar juntos o seu caminho.");
	
	
	JMenuBar menuBar = new JMenuBar();
	private final JMenuBar menuBar_1 = new JMenuBar();
	JMenu mnMais = new JMenu("");
	public static JComboBox jcbSeries = new JComboBox();
	public static JButton jcbEscolha = new JButton("Escolher");

	private final JMenuItem mntmTabela = new JMenuItem("Detalhes");
	private final JMenuItem mntmVoltar = new JMenuItem("");
	
	public static JButton jbProximo = new JButton("Proximo");
	

	
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					serie frame = new serie();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 
	public serie() {
		setTitle("Série+");
		setIconImage(Toolkit.getDefaultToolkit().getImage(serie.class.getResource("/FLAT.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 989, 570);
		setResizable(false);
		
		
		menuBar_1.setForeground(Color.WHITE);
		menuBar_1.setBackground(Color.BLACK);
		jlA.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlA.setForeground(Color.WHITE);
		jlA.setHorizontalAlignment(SwingConstants.CENTER);
		
		jlA.setVisible(false);
		jlF.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlF.setForeground(Color.WHITE);
		jlF.setHorizontalAlignment(SwingConstants.CENTER);
		jlF.setVisible(false);
		jlS.setForeground(Color.WHITE);
		jlS.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlS.setHorizontalAlignment(SwingConstants.CENTER);
		jlS.setVisible(false);
		jlL.setForeground(Color.WHITE);
		jlL.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlL.setHorizontalAlignment(SwingConstants.CENTER);
		jlL.setVisible(false);
		jlD.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlD.setForeground(Color.WHITE);
		jlD.setHorizontalAlignment(SwingConstants.CENTER);
		jlD.setVisible(false);
		jlG.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlG.setForeground(Color.WHITE);
		jlG.setHorizontalAlignment(SwingConstants.CENTER);
		jlG.setVisible(false);
		
		/**---------------------------------------------------------------------**/
		jlFundoArrow.setVisible(false);
		
		/**---------------------------------RESUMO-----------------------------**/
		jlResumoArrow.setVerticalAlignment(SwingConstants.BOTTOM);
		jlResumoArrow.setBounds(238, 75, 520, 250);
		jlResumoArrow.setForeground(Color.BLACK);
		jlResumoArrow.setVisible(false);
		
		jlResumoFlash.setVerticalAlignment(SwingConstants.BOTTOM);
		jlResumoFlash.setBounds(238, 75, 520, 250);
		jlResumoFlash.setVisible(false);
		
		jlResumoSupergirl.setVerticalAlignment(SwingConstants.BOTTOM);
		jlResumoSupergirl.setBounds(238, 75, 520, 250);
		jlResumoSupergirl.setVisible(false);
		
		jlResumoLegends.setVerticalAlignment(SwingConstants.BOTTOM);
		jlResumoLegends.setBounds(238, 75, 520, 250);
		jlResumoLegends.setVisible(false);
		
		jlResumoGOT.setVerticalAlignment(SwingConstants.BOTTOM);
		jlResumoGOT.setBounds(238, 75, 520, 250);
		jlResumoGOT.setVisible(false);
		
		jlResumoDemolidor.setVerticalAlignment(SwingConstants.BOTTOM);
		jlResumoDemolidor.setBounds(238, 75, 520, 250);
		jlResumoDemolidor.setVisible(false);
		
		jlResumoSPN.setVerticalAlignment(SwingConstants.BOTTOM);
		jlResumoSPN.setBounds(238, 75, 520, 250);
		jlResumoSPN.setVisible(false);
		
		jlResumoGrimm.setVerticalAlignment(SwingConstants.BOTTOM);
		jlResumoGrimm.setBounds(238, 75, 520, 250);
		jlResumoGrimm.setVisible(false);
		
		jlResumoTWD.setVerticalAlignment(SwingConstants.BOTTOM);
		jlResumoTWD.setBounds(238, 75, 520, 250);
		jlResumoTWD.setVisible(false);
		
		jlResumoThe100.setVerticalAlignment(SwingConstants.BOTTOM);
		jlResumoThe100.setBounds(238, 75, 520, 250);
		jlResumoThe100.setVisible(false);
		
		jlResumoMrRobot.setVerticalAlignment(SwingConstants.BOTTOM);
		jlResumoMrRobot.setBounds(238, 75, 520, 250);
		jlResumoMrRobot.setVisible(false);
		
		jlResumoGotham.setVerticalAlignment(SwingConstants.BOTTOM);
		jlResumoGotham.setBounds(238, 75, 520, 250);
		jlResumoGotham.setVisible(false);
		
		
		panelarrow.setVisible(false);
		panelflash.setVisible(false);
		panelsupergirl.setVisible(false);
		panellegends.setVisible(false);
		paneldemolidor.setVisible(false);
		panelgrimm.setVisible(false);
		panelgot.setVisible(false);
		panelsupernatural.setVisible(false);
		panelthe100.setVisible(false);
		panelgotham.setVisible(false);
		paneltwd.setVisible(false);
		panelrobot.setVisible(false);
		jbProximo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				jbProximo.setForeground(Color.BLACK);
				jbProximo.setBackground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				jbProximo.setForeground(Color.WHITE);
				jbProximo.setBackground(Color.BLACK);
			}
		});
		jbProximo.setBounds(850, 465, 110, 25);
		
		
		jbProximo.setVisible(false);
		setJMenuBar(menuBar_1);
		
		
		
		mnMais.setIcon(new ImageIcon(serie.class.getResource("/button-304224_640.png")));
		mnMais.setForeground(Color.WHITE);
		mnMais.setBackground(Color.DARK_GRAY);
		menuBar_1.add(mnMais);
		mntmTabela.setForeground(Color.WHITE);
		mntmTabela.setBackground(Color.BLACK);
		mntmTabela.setIcon(new ImageIcon(serie.class.getResource("/button-304224_640.png")));
		mntmTabela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tab.setVisible(true);
				panelarrow.setVisible(false);
				panelflash.setVisible(false);
				panelsupergirl.setVisible(false);
				panellegends.setVisible(false);
				paneldemolidor.setVisible(false);
				panelgrimm.setVisible(false);
				ser2.panelgame.setVisible(false);
				ser2.panelsupernatural.setVisible(false);
				ser2.panelthe100.setVisible(false);
				ser2.panelgotham.setVisible(false);
				ser2.paneltwd.setVisible(false);
				ser2.panelrobot.setVisible(false);
				jcbSeries.setVisible(false);
				jcbEscolha.setVisible(false);
				ser2.setVisible(false);
			}
		});
		
		mnMais.add(mntmTabela);
		mntmVoltar.setSelected(true);
		mntmVoltar.setHorizontalAlignment(SwingConstants.LEFT);
		mntmVoltar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_UNDEFINED, 0));
		mntmVoltar.setIcon(new ImageIcon(serie.class.getResource("/53529.png")));
		mntmVoltar.setBackground(Color.BLACK);
		mntmVoltar.setForeground(Color.WHITE);
		mntmVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tab.setVisible(false);
				panelarrow.setVisible(false);
				panelflash.setVisible(false);
				panelsupergirl.setVisible(false);
				panellegends.setVisible(false);
				paneldemolidor.setVisible(false);
				panelgrimm.setVisible(false);
				ser2.setVisible(false);
				panelgot.setVisible(false);
				panelsupernatural.setVisible(false);
				panelthe100.setVisible(false);
				panelgotham.setVisible(false);
				paneltwd.setVisible(false);
				panelrobot.setVisible(false);
				jbProximo.setVisible(false);
				jlResumoFlash.setVisible(false);
				jlResumoSupergirl.setVisible(false);
				jlResumoGotham.setVisible(false);
				jlResumoGrimm.setVisible(false);
				jlResumoDemolidor.setVisible(false);
				jlResumoLegends.setVisible(false);
				jlResumoGOT.setVisible(false);
				jlResumoThe100.setVisible(false);
				jlResumoSPN.setVisible(false);
				jlResumoMrRobot.setVisible(false);
				jlResumoArrow.setVisible(false);
				
				jlLogo.setVisible(true);
				jlFundoArrow.setVisible(false);
				jcbSeries.setVisible(true);
				jcbEscolha.setVisible(true);
				
			}
		});
		
		menuBar_1.add(mntmVoltar);
		contentPane = new JPanel();
		contentPane.setMinimumSize(new Dimension(2000, 2000));
		contentPane.setPreferredSize(new Dimension(2000, 2000));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		tab.setForeground(Color.WHITE);
		tab.setBackground(Color.BLACK);
		
		/**--------------------------------ADD InternalFrames---------------------------------------**/
		ser2.setBounds(0, 0, 975, 570);
		contentPane.add(ser2);
		tab.setBounds(0, 0, 975, 570);
		contentPane.add(tab);
		/**-----------------------------------------------------------------------------------------**/
		
		JLabel arrow = new JLabel("");
		arrow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelarrow.setBackground(new Color(0, 206, 209));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
		
				panelarrow.setBackground(new Color(0, 102, 51));
				
			}
		});
		arrow.setIcon(new ImageIcon(serie.class.getResource("/arrow-season-1-posters-3.jpg")));
		arrow.setBounds(24, 17, 100, 150);
		panelarrow.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panelarrow.add(arrow);
		
		
		flash.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelflash.setBackground(new Color(0, 206, 209));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
		
				panelflash.setBackground(new Color(153, 0, 0));
				
			}
		});
		flash.setIcon(new ImageIcon(serie.class.getResource("/The_Flash_(2014_TV_Series)_Poster.jpg")));
		flash.setBounds(24, 17, 100, 150);
		panelflash.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panelflash.add(flash);
		
		JLabel supergirl = new JLabel("");
		supergirl.setIcon(new ImageIcon(serie.class.getResource("/Poster-supergirl-2015-tv-series-38643473-680-1000.jpg")));
		supergirl.setBounds(24, 17, 100, 150);
		panelsupergirl.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panelsupergirl.add(supergirl);
		
		
		panelarrow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {

				panelarrow.setBackground(new Color(0, 206, 209));
				jcbEpisodioA.setBackground(new Color(0, 206, 209));
				jcbTemporadaA.setBackground(new Color(0, 206, 209));
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {

				panelarrow.setBackground(new Color(0, 102, 51));
				jcbEpisodioA.setBackground(new Color(0, 153, 102));
				jcbTemporadaA.setBackground(new Color(0, 153, 102));
			}
		});
		panelarrow.setBackground(new Color(0, 102, 51));
		panelarrow.setBounds(10, 56, 150, 398);
		contentPane.add(panelarrow);
		panelarrow.setLayout(null);
		jlArrow.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlArrow.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		jlArrow.setBounds(0, 175, 150, 14);
		panelarrow.add(jlArrow);
		jlArrow.setForeground(Color.WHITE);
		jcbEpisodioA.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		
		
		jcbEpisodioA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {

				panelarrow.setBackground(new Color(0, 206, 209));
				jcbEpisodioA.setBackground(new Color(0, 206, 209));
				setCursor(new Cursor(Cursor.HAND_CURSOR));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {

				panelarrow.setBackground(new Color(0, 102, 51));
				jcbEpisodioA.setBackground(new Color(0, 153, 102));
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				
			}
		});
		jcbEpisodioA.setBounds(24, 250, 100, 20);
		panelarrow.add(jcbEpisodioA);
		jcbEpisodioA.setBackground(new Color(0, 102, 51));
		jcbEpisodioA.setForeground(Color.WHITE);
		jcbEpisodioA.setModel(new DefaultComboBoxModel(new String[] {"Episodios", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		jcbTemporadaA.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		
		
		jcbTemporadaA.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
			panelarrow.setBackground(new Color(0, 206, 209));
			jcbTemporadaA.setBackground(new Color(0, 206, 209));
			setCursor(new Cursor(Cursor.HAND_CURSOR));
			
		}
		@Override
		public void mouseExited(MouseEvent e) {

			panelarrow.setBackground(new Color(0, 102, 51));
			jcbTemporadaA.setBackground(new Color(0, 153, 102));
			setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			
			
		}
		});
		jcbTemporadaA.setBounds(24, 220, 118, 20);
		jcbTemporadaA.setModel(new DefaultComboBoxModel(new String[] {"Temporada", "1ª temporada", "2ª temporada", "3ª temporada", "4ª temporada"}));
		jcbTemporadaA.setForeground(Color.WHITE);
		jcbTemporadaA.setBackground(new Color(0, 102, 51));
		panelarrow.add(jcbTemporadaA);
		jbAssistiArrow.setFont(new Font("Tahoma", Font.BOLD, 11));
		jbAssistiArrow.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jbAssistiArrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Runtime.getRuntime().exec("cmd.exe /C start https://www.netflix.com/title/70242081");//Abre o site no navegador padrão				
				} catch (IOException e) {
					e.printStackTrace();
				}
				String nomeantigo = jlArrow.getText();
				String nomenovo = jlArrow.getText();
				String temporada = jcbTemporadaA.getSelectedItem().toString();
				String episodio = jcbEpisodioA.getSelectedItem().toString();
				if(temporada.equals("Temporada")||episodio.equals("Episodios")){
					
					JOptionPane.showMessageDialog(null, "Selecione a temporada e o episódio assistido");
				}
				else{
				ser.editar(nomeantigo, temporada, episodio, nomenovo);
				jlA.setText("Episódio "+episodio+" assistido");
				jlA.setVisible(true);
				JOptionPane.showMessageDialog(null, "Episódio "+episodio+ " da " +temporada+ " assistido!");
				tab.preencheTabela(ser.listagem());
				}
			}
		});
		
		
		jbAssistiArrow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				jbAssistiArrow.setBackground(new Color(0, 206, 209));
				jbAssistiArrow.setForeground(Color.BLACK);
				panelarrow.setBackground(new Color(0, 206, 209));
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				jbAssistiArrow.setForeground(Color.WHITE);
				jbAssistiArrow.setBackground(new Color(0, 153, 102));
				panelarrow.setBackground(new Color(0, 102, 51));
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		jbAssistiArrow.setFocusPainted(false);
		jbAssistiArrow.setBounds(24, 280, 89, 23);
		panelarrow.add(jbAssistiArrow);
		jbAssistiArrow.setForeground(Color.WHITE);
		jbAssistiArrow.setBackground(new Color(0, 102, 51));
		
		
		jlA.setBounds(0, 331, 150, 14);
		panelarrow.add(jlA);
		
		
		
		panelflash.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelflash.setBackground(new Color(0, 206, 209));
				jcbTemporadaF.setBackground(new Color(0, 206, 209));
				jcbEpisodioF.setBackground(new Color(0, 206, 209));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelflash.setBackground(new Color(153, 0, 0));
				jcbTemporadaF.setBackground(new Color(153, 0, 0));
				jcbEpisodioF.setBackground(new Color(153, 0, 0));
			}
		});
		panelflash.setBackground(new Color(153, 0, 0));
		panelflash.setBounds(170, 56, 150, 398);
		contentPane.add(panelflash);
		panelflash.setLayout(null);
		jlTheFlash.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlTheFlash.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		jlTheFlash.setForeground(Color.WHITE);
		jlTheFlash.setBounds(0, 175, 150, 14);
		panelflash.add(jlTheFlash);
		jcbTemporadaF.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		
		
		jcbTemporadaF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelflash.setBackground(new Color(0, 206, 209));
				jcbTemporadaF.setBackground(new Color(0, 206, 209));
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelflash.setBackground(new Color(153, 0, 0));
				jcbTemporadaF.setBackground(new Color(153, 0, 0));
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		jcbTemporadaF.setModel(new DefaultComboBoxModel(new String[] {"Temporada", "1ª temporada", "2ª temporada"}));
		jcbTemporadaF.setForeground(Color.WHITE);
		jcbTemporadaF.setBackground(new Color(153, 0, 0));
		jcbTemporadaF.setBounds(24, 220, 118, 20);
		panelflash.add(jcbTemporadaF);
		jcbEpisodioF.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		
		
		jcbEpisodioF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelflash.setBackground(new Color(0, 206, 209));
				jcbEpisodioF.setBackground(new Color(0, 206, 209));
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelflash.setBackground(new Color(153, 0, 0));
				jcbEpisodioF.setBackground(new Color(153, 0, 0));
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		jcbEpisodioF.setModel(new DefaultComboBoxModel(new String[] {"Episodios", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		jcbEpisodioF.setForeground(Color.WHITE);
		jcbEpisodioF.setBackground(new Color(153, 0, 0));
		jcbEpisodioF.setBounds(24, 250, 100, 20);
		panelflash.add(jcbEpisodioF);
		jbAssistiFlash.setFont(new Font("Tahoma", Font.BOLD, 11));
		jbAssistiFlash.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jbAssistiFlash.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent i) {
				try {
					Runtime.getRuntime().exec("cmd.exe /C start https://www.netflix.com/title/80027042");//Abre o site no navegador padrão				
				} catch (IOException i1) {
					i1.printStackTrace();
				}
				String nomeantigo = jlTheFlash.getText();
				String nomenovo = jlTheFlash.getText();
				String temporada = jcbTemporadaF.getSelectedItem().toString();
				String episodio = jcbEpisodioF.getSelectedItem().toString();
				if(temporada.equals("Temporada")||episodio.equals("Episodios")){
					
					JOptionPane.showMessageDialog(null, "Selecione a temporada e o episódio assistido");
				}
				else{
					
				ser.editar(nomenovo,temporada,episodio, nomeantigo);
				jlF.setText("Episódio "+episodio+" assistido");
				jlF.setVisible(true);
				JOptionPane.showMessageDialog(null, "Episódio "+episodio+ " da " +temporada+ " assistido!");
				tab.preencheTabela(ser.listagem());
				
				}
			}
		});
		
		
		jbAssistiFlash.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				jbAssistiFlash.setBackground(new Color(0, 206, 209));
				jbAssistiFlash.setForeground(Color.BLACK);
				panelflash.setBackground(new Color(0, 206, 209));
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				jbAssistiFlash.setForeground(Color.WHITE);
				jbAssistiFlash.setBackground(new Color(153, 0, 51));
				panelflash.setBackground(new Color(153, 0, 0));
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		jbAssistiFlash.setFocusPainted(false);
		jbAssistiFlash.setForeground(Color.WHITE);
		jbAssistiFlash.setBackground(new Color(153, 0, 0));
		jbAssistiFlash.setBounds(24, 280, 89, 23);
		panelflash.add(jbAssistiFlash);
		
		
		jlF.setBounds(0, 329, 150, 14);
		panelflash.add(jlF);
		
		panelsupergirl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelsupergirl.setBackground(new Color(0, 206, 209));
				jcbTemporadaS.setBackground(new Color(0, 206, 209));
				jcbEpisodioS.setBackground(new Color(0, 206, 209));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelsupergirl.setBackground(new Color(51, 102, 204));
				jcbTemporadaS.setBackground(new Color(51, 102, 204));
				jcbEpisodioS.setBackground(new Color(51, 102, 204));
			}
		});
		panelsupergirl.setBackground(new Color(51, 102, 204));
		panelsupergirl.setBounds(330, 56, 150, 398);
		contentPane.add(panelsupergirl);
		panelsupergirl.setLayout(null);
		jlSupergirl.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlSupergirl.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		jlSupergirl.setForeground(Color.WHITE);
		jlSupergirl.setBounds(0, 175, 150, 14);
		panelsupergirl.add(jlSupergirl);
		jcbTemporadaS.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		
		
		jcbTemporadaS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelsupergirl.setBackground(new Color(0, 206, 209));
				jcbTemporadaS.setBackground(new Color(0, 206, 209));
				setCursor(new Cursor(Cursor.HAND_CURSOR));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelsupergirl.setBackground(new Color(51, 102, 204));
				jcbTemporadaS.setBackground(new Color(51, 102, 204));
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		jcbTemporadaS.setModel(new DefaultComboBoxModel(new String[] {"Temporada", "1ª temporada"}));
		jcbTemporadaS.setForeground(Color.WHITE);
		jcbTemporadaS.setBackground(new Color(51, 102, 204));
		jcbTemporadaS.setBounds(24, 220, 118, 20);
		panelsupergirl.add(jcbTemporadaS);
		jcbEpisodioS.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		
		
		jcbEpisodioS.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelsupergirl.setBackground(new Color(0, 206, 209));
				jcbEpisodioS.setBackground(new Color(0, 206, 209));
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelsupergirl.setBackground(new Color(51, 102, 204));
				jcbEpisodioS.setBackground(new Color(51, 102, 204));
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		jcbEpisodioS.setModel(new DefaultComboBoxModel(new String[] {"Episódios", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		jcbEpisodioS.setForeground(Color.WHITE);
		jcbEpisodioS.setBackground(new Color(51, 102, 204));
		jcbEpisodioS.setBounds(24, 250, 100, 20);
		panelsupergirl.add(jcbEpisodioS);
		jbAssistiSuper.setFont(new Font("Tahoma", Font.BOLD, 11));
		jbAssistiSuper.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jbAssistiSuper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomeantigo= jlSupergirl.getText();
				String nomenovo= jlSupergirl.getText();
				String temporada = jcbTemporadaS.getSelectedItem().toString();
				String episodio = jcbEpisodioS.getSelectedItem().toString();
				if(temporada.equals("Temporada")||episodio.equals("Episodios")){
					
					JOptionPane.showMessageDialog(null, "Selecione a temporada e o episódio assistido");
				}
				else{
				ser.editar(nomenovo, temporada, episodio, nomeantigo);
				jlS.setText("Episódio "+episodio+" assistido");
				jlS.setVisible(true);
				JOptionPane.showMessageDialog(null, "Episódio "+episodio+ " da " +temporada+ " assistido!");
				tab.preencheTabela(ser.listagem());
				}
			}
		});
		
		
		jbAssistiSuper.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				jbAssistiSuper.setBackground(new Color(0, 206, 209));
				jbAssistiSuper.setForeground(Color.BLACK);
				panelsupergirl.setBackground(new Color(0, 206, 209));
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				jbAssistiSuper.setForeground(Color.WHITE);
				jbAssistiSuper.setBackground(new Color(0, 102, 204));
				panelsupergirl.setBackground(new Color(51, 102, 204));
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		jbAssistiSuper.setFocusPainted(false);
		jbAssistiSuper.setForeground(Color.WHITE);
		jbAssistiSuper.setBackground(new Color(51, 102, 204));
		jbAssistiSuper.setBounds(24, 280, 89, 23);
		panelsupergirl.add(jbAssistiSuper);
		
		
		jlS.setBounds(0, 327, 150, 14);
		panelsupergirl.add(jlS);
		panellegends.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		
		panellegends.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panellegends.setBackground(new Color(0, 206, 209));
				jcbTemporadaL.setBackground(new Color(0, 206, 209));
				jcbEpisodioL.setBackground(new Color(0, 206, 209));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panellegends.setBackground(new Color(255, 102, 0));
				jcbTemporadaL.setBackground(new Color(255, 102, 0));
				jcbEpisodioL.setBackground(new Color(255, 102, 0));
			}
		});
		panellegends.setBackground(new Color(255, 102, 0));
		panellegends.setBounds(490, 56, 150, 398);
		contentPane.add(panellegends);
		panellegends.setLayout(null);
		
		JLabel legends = new JLabel("");
		legends.setBounds(24, 17, 100, 150);
		panellegends.add(legends);
		legends.setIcon(new ImageIcon(serie.class.getResource("/LegendsKeyArt_5661d7e99d5e60.02559670.PNG")));
		jlLegends.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlLegends.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		jlLegends.setForeground(Color.WHITE);
		jlLegends.setBounds(0, 175, 150, 14);
		panellegends.add(jlLegends);
		jcbTemporadaL.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		
		
		jcbTemporadaL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panellegends.setBackground(new Color(0, 206, 209));
				jcbTemporadaL.setBackground(new Color(0, 206, 209));
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panellegends.setBackground(new Color(255, 102, 0));
				jcbTemporadaL.setBackground(new Color(255, 102, 0));
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		jcbTemporadaL.setModel(new DefaultComboBoxModel(new String[] {"Temporada", "1ª temporada"}));
		jcbTemporadaL.setForeground(Color.WHITE);
		jcbTemporadaL.setBackground(new Color(255, 102, 0));
		jcbTemporadaL.setBounds(24, 220, 118, 20);
		panellegends.add(jcbTemporadaL);
		jcbEpisodioL.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		
		
		jcbEpisodioL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panellegends.setBackground(new Color(0, 206, 209));
				jcbEpisodioL.setBackground(new Color(0, 206, 209));
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panellegends.setBackground(new Color(255, 102, 0));
				jcbEpisodioL.setBackground(new Color(255, 102, 0));
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		jcbEpisodioL.setModel(new DefaultComboBoxModel(new String[] {"Episódios", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		jcbEpisodioL.setForeground(Color.WHITE);
		jcbEpisodioL.setBackground(new Color(255, 102, 0));
		jcbEpisodioL.setBounds(24, 250, 100, 20);
		panellegends.add(jcbEpisodioL);
		jbAssistiLegends.setFont(new Font("Tahoma", Font.BOLD, 11));
		jbAssistiLegends.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jbAssistiLegends.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomeantigo=jlLegends.getText();
				String nomenovo = jlLegends.getText();
				String temporada = jcbTemporadaL.getSelectedItem().toString();
				String episodio = jcbEpisodioL.getSelectedItem().toString();
				if(temporada.equals("Temporada")||episodio.equals("Episodios")){
					
					JOptionPane.showMessageDialog(null, "Selecione a temporada e o episódio assistido");
				}
				else{
				ser.editar(nomenovo,temporada,episodio,nomeantigo);
				jlL.setText("Episódio "+episodio+" assistido");
				jlL.setVisible(true);
				JOptionPane.showMessageDialog(null, "Episódio "+episodio+ " da " +temporada+ " assistido!");
				tab.preencheTabela(ser.listagem());
				}
			}
		});
		
		
		jbAssistiLegends.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				jbAssistiLegends.setBackground(new Color(0, 206, 209));
				jbAssistiLegends.setForeground(Color.BLACK);
				panellegends.setBackground(new Color(0, 206, 209));
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				jbAssistiLegends.setForeground(Color.WHITE);
				jbAssistiLegends.setBackground(new Color(204, 102, 0));
				panellegends.setBackground(new Color(255, 102, 0));
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		jbAssistiLegends.setFocusPainted(false);
		jbAssistiLegends.setForeground(Color.WHITE);
		jbAssistiLegends.setBackground(new Color(204, 102, 0));
		jbAssistiLegends.setBounds(24, 280, 89, 23);
		panellegends.add(jbAssistiLegends);
		
		
		jlL.setBounds(0, 326, 150, 14);
		panellegends.add(jlL);
		paneldemolidor.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		
		paneldemolidor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				paneldemolidor.setBackground(new Color(0, 206, 209));
				jcbTemporadaD.setBackground(new Color(0, 206, 209));
				jcbEpisodioD.setBackground(new Color(0, 206, 209));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				paneldemolidor.setBackground(new Color(102, 0, 0));
				jcbTemporadaD.setBackground(new Color(102, 0, 0));
				jcbEpisodioD.setBackground(new Color(102, 0, 0));
			}
		});
		paneldemolidor.setBackground(new Color(102, 0, 0));
		paneldemolidor.setBounds(650, 56, 150, 398);
		contentPane.add(paneldemolidor);
		paneldemolidor.setLayout(null);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(24, 17, 100, 150);
		paneldemolidor.add(label_3);
		label_3.setIcon(new ImageIcon(serie.class.getResource("/dd_vertical-bloodyknuckles_us-main.jpg")));
		jlDemolidor.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlDemolidor.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		jlDemolidor.setBounds(0, 175, 150, 14);
		jlDemolidor.setForeground(Color.WHITE);
		paneldemolidor.add(jlDemolidor);
		jcbTemporadaD.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		
		
		jcbTemporadaD.setBounds(24, 220, 118, 20);
		jcbTemporadaD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				paneldemolidor.setBackground(new Color(0, 206, 209));
				jcbTemporadaD.setBackground(new Color(0, 206, 209));
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				paneldemolidor.setBackground(new Color(102, 0, 0));
				jcbTemporadaD.setBackground(new Color(102, 0, 0));
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		jcbTemporadaD.setModel(new DefaultComboBoxModel(new String[] {"Temporada", "1ª temporada", "2ª temporada"}));
		jcbTemporadaD.setForeground(Color.WHITE);
		jcbTemporadaD.setBackground(new Color(102, 0, 0));
		paneldemolidor.add(jcbTemporadaD);
		jcbEpisodioD.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		
		
		jcbEpisodioD.setBounds(24, 250, 100, 20);
		jcbEpisodioD.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				paneldemolidor.setBackground(new Color(0, 206, 209));
				jcbEpisodioD.setBackground(new Color(0, 206, 209));
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				paneldemolidor.setBackground(new Color(102, 0, 0));
				jcbEpisodioD.setBackground(new Color(102, 0, 0));
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		jcbEpisodioD.setModel(new DefaultComboBoxModel(new String[] {"Episódios", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"}));
		jcbEpisodioD.setForeground(Color.WHITE);
		jcbEpisodioD.setBackground(new Color(102, 0, 0));
		paneldemolidor.add(jcbEpisodioD);
		jbAssistiDemolidor.setFont(new Font("Tahoma", Font.BOLD, 11));
		jbAssistiDemolidor.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jbAssistiDemolidor.setBounds(24, 280, 89, 23);
		jbAssistiDemolidor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomeantigo= jlDemolidor.getText();
				String nomenovo= jlDemolidor.getText();
				String temporada = jcbTemporadaD.getSelectedItem().toString();
				String episodio = jcbEpisodioD.getSelectedItem().toString();
				if(temporada.equals("Temporada")||episodio.equals("Episodios")){
					
					JOptionPane.showMessageDialog(null, "Selecione a temporada e o episódio assistido");
				}
				else{
					ser.editar(nomenovo,temporada,episodio,nomeantigo);
					jlD.setText("Episódio "+episodio+" assistido");
					jlD.setVisible(true);
				JOptionPane.showMessageDialog(null, "Episódio "+episodio+ " da " +temporada+ " assistido!");
				tab.preencheTabela(ser.listagem());
				}
			}
		});
		
		
		jbAssistiDemolidor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				jbAssistiDemolidor.setBackground(new Color(0, 206, 209));
				jbAssistiDemolidor.setForeground(Color.BLACK);
				paneldemolidor.setBackground(new Color(0, 206, 209));
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				jbAssistiDemolidor.setForeground(Color.WHITE);
				jbAssistiDemolidor.setBackground(new Color(102, 51, 51));
				paneldemolidor.setBackground(new Color(102, 0, 0));
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		jbAssistiDemolidor.setFocusPainted(false);
		jbAssistiDemolidor.setForeground(Color.WHITE);
		jbAssistiDemolidor.setBackground(new Color(102, 0, 0));
		paneldemolidor.add(jbAssistiDemolidor);
		
		
		jlD.setBounds(0, 326, 150, 14);
		paneldemolidor.add(jlD);
		panelgrimm.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		
		panelgrimm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelgrimm.setBackground(new Color(0, 206, 209));
				jcbTemporadaG.setBackground(new Color(0, 206, 209));
				jcbEpisodioG.setBackground(new Color(0, 206, 209));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelgrimm.setBackground(Color.GRAY);
				jcbTemporadaG.setBackground(Color.GRAY);
				jcbEpisodioG.setBackground(Color.GRAY);
			}
		});
		panelgrimm.setLayout(null);
		panelgrimm.setBackground(Color.GRAY);
		panelgrimm.setBounds(810, 56, 150, 398);
		contentPane.add(panelgrimm);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(serie.class.getResource("/GRIMM-Season-3-Poster.jpg")));
		label_1.setBounds(24, 17, 100, 150);
		panelgrimm.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(24, 24, 100, 150);
		panelgrimm.add(label_2);
		jlGrimm.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlGrimm.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		jlGrimm.setForeground(Color.WHITE);
		jlGrimm.setBounds(0, 175, 150, 14);
		panelgrimm.add(jlGrimm);
		jcbTemporadaG.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		
		
		jcbTemporadaG.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelgrimm.setBackground(new Color(0, 206, 209));
				jcbTemporadaG.setBackground(new Color(0, 206, 209));
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelgrimm.setBackground(Color.GRAY);
				jcbTemporadaG.setBackground(Color.GRAY);
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		jcbTemporadaG.setModel(new DefaultComboBoxModel(new String[] {"Temporada", "1ª temporada", "2ª temporada", "3ª temporada", "4ª temporada", "5ª temporada"}));
		jcbTemporadaG.setForeground(Color.WHITE);
		jcbTemporadaG.setBackground(Color.GRAY);
		jcbTemporadaG.setBounds(24, 220, 118, 20);
		panelgrimm.add(jcbTemporadaG);
		jcbEpisodioG.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		
		
		jcbEpisodioG.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panelgrimm.setBackground(new Color(0, 206, 209));
				jcbEpisodioG.setBackground(new Color(0, 206, 209));
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panelgrimm.setBackground(Color.GRAY);
				jcbEpisodioG.setBackground(Color.GRAY);
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		jcbEpisodioG.setModel(new DefaultComboBoxModel(new String[] {"Episódios", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22"}));
		jcbEpisodioG.setForeground(Color.WHITE);
		jcbEpisodioG.setBackground(Color.GRAY);
		jcbEpisodioG.setBounds(24, 250, 100, 20);
		panelgrimm.add(jcbEpisodioG);
		jbAssistiGrimm.setFont(new Font("Tahoma", Font.BOLD, 11));
		jbAssistiGrimm.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jbAssistiGrimm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomeantigo= jlGrimm.getText();
				String nomenovo= jlGrimm.getText();
				String temporada = jcbTemporadaG.getSelectedItem().toString();
				String episodio = jcbEpisodioG.getSelectedItem().toString();
				if(temporada.equals("Temporada")||episodio.equals("Episodios")){
					
					JOptionPane.showMessageDialog(null, "Selecione a temporada e o episódio assistido");
				}
				else{
					ser.editar(nomenovo,temporada,episodio,nomeantigo);
					jlG.setText("Episódio "+episodio+" assistido");
					jlG.setVisible(true);
				JOptionPane.showMessageDialog(null, "Episódio "+episodio+ " da " +temporada+ " assistido!");
				tab.preencheTabela(ser.listagem());
				}
			}
		});
		
		
		jbAssistiGrimm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				jbAssistiGrimm.setBackground(new Color(0, 206, 209));
				jbAssistiGrimm.setForeground(Color.BLACK);
				panelgrimm.setBackground(new Color(0, 206, 209));
				setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				jbAssistiGrimm.setForeground(Color.WHITE);
				jbAssistiGrimm.setBackground(new Color(153, 153, 153));
				panelgrimm.setBackground(Color.GRAY);
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		jbAssistiGrimm.setFocusPainted(false);
		jbAssistiGrimm.setForeground(Color.WHITE);
		jbAssistiGrimm.setBackground(Color.GRAY);
		jbAssistiGrimm.setBounds(24, 280, 89, 23);
		panelgrimm.add(jbAssistiGrimm);
		
		
		jlG.setBounds(0, 327, 150, 14);
		panelgrimm.add(jlG);
		jcbEscolha.setBounds(520, 22, 89, 23);
		
		
		jcbEscolha.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jcbEscolha.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jcbEscolha.setFocusPainted(false);
		jcbEscolha.setBackground(Color.BLACK);
		jcbEscolha.setForeground(Color.WHITE);
		jcbEscolha.setFont(new Font("Tahoma", Font.BOLD, 11));
		jcbEscolha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String series = jcbSeries.getSelectedItem().toString();
				if(series.equals("Todas"))
				{
					panelarrow.setVisible(true);
					panelarrow.setBounds(10, 56, 150, 398);
					panelflash.setVisible(true);
					panelflash.setBounds(170, 56, 150, 398);
					panelsupergirl.setVisible(true);
					panelsupergirl.setBounds(330, 56, 150, 398);
					panellegends.setVisible(true);
					panellegends.setBounds(490, 56, 150, 398);
					paneldemolidor.setVisible(true);
					paneldemolidor.setBounds(650, 56, 150, 398);
					panelgrimm.setVisible(true);
					panelgrimm.setBounds(810, 56, 150, 398);
					jlLogo.setVisible(false);
					jlFundoArrow.setVisible(false);
					jlResumoArrow.setVisible(false);
					jlResumoFlash.setVisible(false);
					jlResumoSupergirl.setVisible(false);
					jlResumoGotham.setVisible(false);
					jlResumoGrimm.setVisible(false);
					jlResumoDemolidor.setVisible(false);
					jlResumoLegends.setVisible(false);
					jlResumoGOT.setVisible(false);
					jlResumoThe100.setVisible(false);
					jlResumoSPN.setVisible(false);
					jlResumoMrRobot.setVisible(false);
					jlResumoTWD.setVisible(false);
					jbProximo.setVisible(true);
					
				}
				if(series.equals("Arrow"))
				{
					panelarrow.setVisible(true);
					panelflash.setVisible(false);
					panelsupergirl.setVisible(false);
					panellegends.setVisible(false);
					paneldemolidor.setVisible(false);
					panelgrimm.setVisible(false);
					jlLogo.setVisible(false);
					jlResumoFlash.setVisible(false);
					jlResumoSupergirl.setVisible(false);
					jlResumoGotham.setVisible(false);
					jlResumoGrimm.setVisible(false);
					jlResumoDemolidor.setVisible(false);
					jlResumoLegends.setVisible(false);
					jlResumoGOT.setVisible(false);
					jlResumoThe100.setVisible(false);
					jlResumoSPN.setVisible(false);
					jlResumoMrRobot.setVisible(false);
					jlResumoTWD.setVisible(false);
					jlFundoArrow.setVisible(true);
					jlResumoArrow.setVisible(true);
				}
				
				if(series.equals("The Flash"))
				{
					panelflash.setVisible(true);
					panelflash.setBounds(10, 56, 150, 398);
					panelarrow.setVisible(false);
					panelsupergirl.setVisible(false);
					panellegends.setVisible(false);
					paneldemolidor.setVisible(false);
					panelgrimm.setVisible(false);
					jlLogo.setVisible(false);
					jlFundoArrow.setVisible(false);
					jlResumoArrow.setVisible(false);
					jlResumoSupergirl.setVisible(false);
					jlResumoGotham.setVisible(false);
					jlResumoGrimm.setVisible(false);
					jlResumoDemolidor.setVisible(false);
					jlResumoLegends.setVisible(false);
					jlResumoGOT.setVisible(false);
					jlResumoThe100.setVisible(false);
					jlResumoSPN.setVisible(false);
					jlResumoMrRobot.setVisible(false);
					jlResumoTWD.setVisible(false);
					jlResumoFlash.setVisible(true);
				}
				
				if(series.equals("Supergirl"))
				{
					panelsupergirl.setVisible(true);
					panelsupergirl.setBounds(10, 56, 150, 398);
					panelarrow.setVisible(false);
					panelflash.setVisible(false);
					panellegends.setVisible(false);
					paneldemolidor.setVisible(false);
					panelgrimm.setVisible(false);
					jlLogo.setVisible(false);
					jlFundoArrow.setVisible(false);
					jlResumoArrow.setVisible(false);
					jlResumoFlash.setVisible(false);
					jlResumoGotham.setVisible(false);
					jlResumoGrimm.setVisible(false);
					jlResumoDemolidor.setVisible(false);
					jlResumoLegends.setVisible(false);
					jlResumoGOT.setVisible(false);
					jlResumoThe100.setVisible(false);
					jlResumoSPN.setVisible(false);
					jlResumoMrRobot.setVisible(false);
					jlResumoTWD.setVisible(false);
					jlResumoSupergirl.setVisible(true);
				}
				
				if(series.equals("Legends of Tomorrow"))
				{
					panellegends.setVisible(true);
					panellegends.setBounds(10, 56, 150, 398);
					panelarrow.setVisible(false);
					panelflash.setVisible(false);
					panelsupergirl.setVisible(false);
					paneldemolidor.setVisible(false);
					panelgrimm.setVisible(false);
					jlLogo.setVisible(false);
					jlFundoArrow.setVisible(false);
					jlResumoArrow.setVisible(false);
					jlResumoFlash.setVisible(false);
					jlResumoSupergirl.setVisible(false);
					jlResumoGotham.setVisible(false);
					jlResumoGrimm.setVisible(false);
					jlResumoDemolidor.setVisible(false);
					jlResumoGOT.setVisible(false);
					jlResumoThe100.setVisible(false);
					jlResumoSPN.setVisible(false);
					jlResumoMrRobot.setVisible(false);
					jlResumoTWD.setVisible(false);
					jlResumoLegends.setVisible(true);
				}
				
				if(series.equals("Demolidor"))
				{
					paneldemolidor.setVisible(true);
					paneldemolidor.setBounds(10, 56, 150, 398);
					panelarrow.setVisible(false);
					panelflash.setVisible(false);
					panelsupergirl.setVisible(false);
					panellegends.setVisible(false);
					panelgrimm.setVisible(false);
					jlLogo.setVisible(false);
					jlFundoArrow.setVisible(false);
					jlResumoArrow.setVisible(false);
					jlResumoFlash.setVisible(false);
					jlResumoSupergirl.setVisible(false);
					jlResumoGotham.setVisible(false);
					jlResumoGrimm.setVisible(false);
					jlResumoLegends.setVisible(false);
					jlResumoGOT.setVisible(false);
					jlResumoThe100.setVisible(false);
					jlResumoSPN.setVisible(false);
					jlResumoMrRobot.setVisible(false);
					jlResumoTWD.setVisible(false);
					jlResumoDemolidor.setVisible(true);
				}
				
				if(series.equals("Grimm"))
				{
					panelgrimm.setVisible(true);
					panelgrimm.setBounds(10, 56, 150, 398);
					panelarrow.setVisible(false);
					panelflash.setVisible(false);
					panelsupergirl.setVisible(false);
					panellegends.setVisible(false);
					paneldemolidor.setVisible(false);
					jlLogo.setVisible(false);
					jlFundoArrow.setVisible(false);
					jlResumoArrow.setVisible(false);
					jlResumoFlash.setVisible(false);
					jlResumoSupergirl.setVisible(false);
					jlResumoGotham.setVisible(false);
					jlResumoDemolidor.setVisible(false);
					jlResumoLegends.setVisible(false);
					jlResumoGOT.setVisible(false);
					jlResumoThe100.setVisible(false);
					jlResumoSPN.setVisible(false);
					jlResumoMrRobot.setVisible(false);
					jlResumoTWD.setVisible(false);
					jlResumoGrimm.setVisible(true);
				}
				if(series.equals("Game of Thrones"))
				{
					panelgot.setVisible(true);
					panelgot.setBounds(10, 56, 150, 398);
					panelarrow.setVisible(false);
					panelflash.setVisible(false);
					panelsupergirl.setVisible(false);
					panellegends.setVisible(false);
					paneldemolidor.setVisible(false);
					panelgrimm.setVisible(false);
					panelsupernatural.setVisible(false);
					panelthe100.setVisible(false);
					panelgotham.setVisible(false);
					paneltwd.setVisible(false);
					panelrobot.setVisible(false);
					jlLogo.setVisible(false);
					jlFundoArrow.setVisible(false);
					jlResumoArrow.setVisible(false);
					jlResumoFlash.setVisible(false);
					jlResumoSupergirl.setVisible(false);
					jlResumoGotham.setVisible(false);
					jlResumoGrimm.setVisible(false);
					jlResumoDemolidor.setVisible(false);
					jlResumoLegends.setVisible(false);
					jlResumoThe100.setVisible(false);
					jlResumoSPN.setVisible(false);
					jlResumoMrRobot.setVisible(false);
					jlResumoTWD.setVisible(false);
					jlResumoGOT.setVisible(true);
				}
				if(series.equals("Supernatural"))
				{
					panelgot.setVisible(false);
					panelarrow.setVisible(false);
					panelflash.setVisible(false);
					panelsupergirl.setVisible(false);
					panellegends.setVisible(false);
					paneldemolidor.setVisible(false);
					panelgrimm.setVisible(false);
					panelsupernatural.setVisible(true);
					panelsupernatural.setBounds(10, 56, 150, 398);
					panelthe100.setVisible(false);
					panelgotham.setVisible(false);
					paneltwd.setVisible(false);
					panelrobot.setVisible(false);
					jlLogo.setVisible(false);
					jlFundoArrow.setVisible(false);
					jlResumoArrow.setVisible(false);
					jlResumoFlash.setVisible(false);
					jlResumoSupergirl.setVisible(false);
					jlResumoGotham.setVisible(false);
					jlResumoGrimm.setVisible(false);
					jlResumoDemolidor.setVisible(false);
					jlResumoLegends.setVisible(false);
					jlResumoGOT.setVisible(false);
					jlResumoThe100.setVisible(false);
					jlResumoMrRobot.setVisible(false);
					jlResumoTWD.setVisible(false);
					jlResumoSPN.setVisible(true);
				}
				if(series.equals("The 100"))
				{
					panelgot.setVisible(false);
					panelarrow.setVisible(false);
					panelflash.setVisible(false);
					panelsupergirl.setVisible(false);
					panellegends.setVisible(false);
					paneldemolidor.setVisible(false);
					panelgrimm.setVisible(false);
					panelsupernatural.setVisible(false);
					panelthe100.setBounds(10, 56, 150, 398);
					panelthe100.setVisible(true);
					panelgotham.setVisible(false);
					paneltwd.setVisible(false);
					panelrobot.setVisible(false);
					jlLogo.setVisible(false);
					jlFundoArrow.setVisible(false);
					jlResumoArrow.setVisible(false);
					jlResumoFlash.setVisible(false);
					jlResumoSupergirl.setVisible(false);
					jlResumoGotham.setVisible(false);
					jlResumoGrimm.setVisible(false);
					jlResumoDemolidor.setVisible(false);
					jlResumoLegends.setVisible(false);
					jlResumoGOT.setVisible(false);
					jlResumoSPN.setVisible(false);
					jlResumoMrRobot.setVisible(false);
					jlResumoTWD.setVisible(false);
					jlResumoThe100.setVisible(true);
				}
				if(series.equalsIgnoreCase("Mr. Robot"))
				{
					panelgot.setVisible(false);
					panelarrow.setVisible(false);
					panelflash.setVisible(false);
					panelsupergirl.setVisible(false);
					panellegends.setVisible(false);
					paneldemolidor.setVisible(false);
					panelgrimm.setVisible(false);
					panelsupernatural.setVisible(false);
					panelthe100.setVisible(false);
					panelgotham.setVisible(false);
					paneltwd.setVisible(false);
					panelrobot.setVisible(true);
					panelrobot.setBounds(10, 56, 150, 398);
					jlLogo.setVisible(false);
					jlFundoArrow.setVisible(false);
					jlResumoArrow.setVisible(false);
					jlResumoFlash.setVisible(false);
					jlResumoSupergirl.setVisible(false);
					jlResumoGotham.setVisible(false);
					jlResumoGrimm.setVisible(false);
					jlResumoDemolidor.setVisible(false);
					jlResumoLegends.setVisible(false);
					jlResumoGOT.setVisible(false);
					jlResumoThe100.setVisible(false);
					jlResumoSPN.setVisible(false);
					jlResumoTWD.setVisible(false);
					jlResumoMrRobot.setVisible(true);
				}
				if(series.equals("Gotham"))
				{
					panelgot.setVisible(false);
					panelarrow.setVisible(false);
					panelflash.setVisible(false);
					panelsupergirl.setVisible(false);
					panellegends.setVisible(false);
					paneldemolidor.setVisible(false);
					panelgrimm.setVisible(false);
					panelsupernatural.setVisible(false);
					panelthe100.setVisible(false);
					panelgotham.setVisible(true);
					panelgotham.setBounds(10, 56, 150, 398);
					paneltwd.setVisible(false);
					panelrobot.setVisible(false);
					jlLogo.setVisible(false);
					jlFundoArrow.setVisible(false);
					jlResumoArrow.setVisible(false);
					jlResumoFlash.setVisible(false);
					jlResumoSupergirl.setVisible(false);
					jlResumoGrimm.setVisible(false);
					jlResumoDemolidor.setVisible(false);
					jlResumoLegends.setVisible(false);
					jlResumoGOT.setVisible(false);
					jlResumoThe100.setVisible(false);
					jlResumoSPN.setVisible(false);
					jlResumoMrRobot.setVisible(false);
					jlResumoTWD.setVisible(false);
					jlResumoGotham.setVisible(true);
					
				}
				if(series.equals("The Walking Dead"))
				{
					panelgot.setVisible(false);
					panelarrow.setVisible(false);
					panelflash.setVisible(false);
					panelsupergirl.setVisible(false);
					panellegends.setVisible(false);
					paneldemolidor.setVisible(false);
					panelgrimm.setVisible(false);
					panelsupernatural.setVisible(false);
					panelthe100.setVisible(false);
					panelgotham.setVisible(false);
					paneltwd.setVisible(true);
					paneltwd.setBounds(10, 56, 150, 398);
					panelrobot.setVisible(false);
					jlLogo.setVisible(false);
					jlFundoArrow.setVisible(false);
					jlResumoArrow.setVisible(false);
					jlResumoFlash.setVisible(false);
					jlResumoSupergirl.setVisible(false);
					jlResumoGotham.setVisible(false);
					jlResumoGrimm.setVisible(false);
					jlResumoDemolidor.setVisible(false);
					jlResumoLegends.setVisible(false);
					jlResumoGOT.setVisible(false);
					jlResumoThe100.setVisible(false);
					jlResumoSPN.setVisible(false);
					jlResumoMrRobot.setVisible(false);
					jlResumoTWD.setVisible(true);
				}
				
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(jcbEscolha);
		jcbSeries.setBounds(330, 23, 150, 20);
		jcbSeries.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jcbSeries.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		jcbSeries.setBackground(Color.BLACK);
		jcbSeries.setForeground(Color.WHITE);
		jcbSeries.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		
		jcbSeries.setModel(new DefaultComboBoxModel(new String[] {"Todas", "Arrow", "Demolidor", "Grimm", "Legends of Tomorrow", "Supergirl", "The Flash", "Game of Thrones", "Supernatural", "The Walking Dead", "The 100", "Mr. Robot","Gotham"}));
		contentPane.add(jcbSeries);
		
		
		panelgot.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		panelgot.setBackground(new Color(0, 0, 51));
		panelgot.setBounds(10, 36, 150, 398);
		getContentPane().add(panelgot);
		panelgot.setLayout(null);
		
		JLabel got = new JLabel("");
		got.setIcon(new ImageIcon(serie.class.getResource("/game-of-thrones.jpg")));
		got.setBounds(24, 27, 100, 150);
		panelgot.add(got);
		
		JLabel jlGOT = new JLabel("Game of Thrones");
		jlGOT.setHorizontalAlignment(SwingConstants.CENTER);
		jlGOT.setForeground(Color.WHITE);
		jlGOT.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlGOT.setBounds(0, 185, 150, 14);
		panelgot.add(jlGOT);
		
		
		jcbTemporadaGOT.setModel(new DefaultComboBoxModel(new String[] {"Temporada", "1\u00AA temporada", "2\u00AA temporada", "3\u00AA temporada", "4\u00AA temporada", "5 temporada", "6\u00AA temporada"}));
		jcbTemporadaGOT.setForeground(Color.WHITE);
		jcbTemporadaGOT.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jcbTemporadaGOT.setBackground(new Color(0, 0, 51));
		jcbTemporadaGOT.setBounds(24, 230, 118, 20);
		panelgot.add(jcbTemporadaGOT);
		
		
		jcbEpisodioGOT.setModel(new DefaultComboBoxModel(new String[] {"Episodios", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		jcbEpisodioGOT.setForeground(Color.WHITE);
		jcbEpisodioGOT.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jcbEpisodioGOT.setBackground(new Color(0, 0, 51));
		jcbEpisodioGOT.setBounds(24, 260, 100, 20);
		panelgot.add(jcbEpisodioGOT);
		
		JButton jbAssistiGOT = new JButton("Assistido");
		jbAssistiGOT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jbAssistiGOT.setForeground(Color.WHITE);
		jbAssistiGOT.setFont(new Font("Tahoma", Font.BOLD, 11));
		jbAssistiGOT.setFocusPainted(false);
		jbAssistiGOT.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jbAssistiGOT.setBackground(new Color(0, 0, 51));
		jbAssistiGOT.setBounds(24, 290, 89, 23);
		panelgot.add(jbAssistiGOT);
		panelsupernatural.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		
		
		panelsupernatural.setBackground(new Color(102, 102, 0));
		panelsupernatural.setBounds(170, 36, 150, 398);
		getContentPane().add(panelsupernatural);
		panelsupernatural.setLayout(null);
		
		JLabel supernatural = new JLabel("");
		supernatural.setIcon(new ImageIcon(serie.class.getResource("/Supernatural.jpg")));
		supernatural.setBounds(24, 24, 100, 150);
		panelsupernatural.add(supernatural);
		
		
		jlSPN.setHorizontalAlignment(SwingConstants.CENTER);
		jlSPN.setForeground(Color.WHITE);
		jlSPN.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlSPN.setBounds(0, 182, 150, 14);
		panelsupernatural.add(jlSPN);
		
		
		jcbTemporadaSPN.setModel(new DefaultComboBoxModel(new String[] {"Temporada", "1\u00AA temporada", "2\u00AA temporada", "3\u00AA temporada", "4\u00AA temporada", "5\u00AA temporada", "6\u00AA temporada", "7\u00AA temporada", "8\u00AA temporada", "9\u00AA temporada", "10\u00AA temporada", "11\u00AA temporada"}));
		jcbTemporadaSPN.setForeground(Color.WHITE);
		jcbTemporadaSPN.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jcbTemporadaSPN.setBackground(new Color(102, 102, 0));
		jcbTemporadaSPN.setBounds(24, 227, 118, 20);
		panelsupernatural.add(jcbTemporadaSPN);
		
		
		jcbEpisodioSPN.setModel(new DefaultComboBoxModel(new String[] {"Episodios", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		jcbEpisodioSPN.setForeground(Color.WHITE);
		jcbEpisodioSPN.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jcbEpisodioSPN.setBackground(new Color(102, 102, 0));
		jcbEpisodioSPN.setBounds(24, 257, 100, 20);
		panelsupernatural.add(jcbEpisodioSPN);
		
		JButton jbAssistiSPN = new JButton("Assistido");
		jbAssistiSPN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jbAssistiSPN.setForeground(Color.WHITE);
		jbAssistiSPN.setFont(new Font("Tahoma", Font.BOLD, 11));
		jbAssistiSPN.setFocusPainted(false);
		jbAssistiSPN.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jbAssistiSPN.setBackground(new Color(102, 102, 0));
		jbAssistiSPN.setBounds(24, 287, 89, 23);
		panelsupernatural.add(jbAssistiSPN);
		panelthe100.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		
		
		panelthe100.setBackground(new Color(0, 102, 153));
		panelthe100.setBounds(330, 36, 150, 398);
		getContentPane().add(panelthe100);
		panelthe100.setLayout(null);
		
		JLabel the100 = new JLabel("");
		the100.setIcon(new ImageIcon(serie.class.getResource("/the-100.jpg")));
		the100.setBounds(24, 22, 100, 150);
		panelthe100.add(the100);
		
		
		jlThe100.setHorizontalAlignment(SwingConstants.CENTER);
		jlThe100.setForeground(Color.WHITE);
		jlThe100.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlThe100.setBounds(0, 180, 150, 14);
		panelthe100.add(jlThe100);
		
		
		jcbTemporadaThe100.setModel(new DefaultComboBoxModel(new String[] {"Temporada", "1\u00AA temporada", "2\u00AA temporada", "3\u00AA temporada"}));
		jcbTemporadaThe100.setForeground(Color.WHITE);
		jcbTemporadaThe100.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jcbTemporadaThe100.setBackground(new Color(0, 102, 153));
		jcbTemporadaThe100.setBounds(24, 225, 118, 20);
		panelthe100.add(jcbTemporadaThe100);
		
		
		jcbEpisodioThe100.setModel(new DefaultComboBoxModel(new String[] {"Episodios", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"}));
		jcbEpisodioThe100.setForeground(Color.WHITE);
		jcbEpisodioThe100.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jcbEpisodioThe100.setBackground(new Color(0, 102, 153));
		jcbEpisodioThe100.setBounds(24, 255, 100, 20);
		panelthe100.add(jcbEpisodioThe100);
		
		JButton jbAssistiThe100 = new JButton("Assistido");
		jbAssistiThe100.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		jbAssistiThe100.setForeground(Color.WHITE);
		jbAssistiThe100.setFont(new Font("Tahoma", Font.BOLD, 11));
		jbAssistiThe100.setFocusPainted(false);
		jbAssistiThe100.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jbAssistiThe100.setBackground(new Color(0, 102, 153));
		jbAssistiThe100.setBounds(24, 285, 89, 23);
		panelthe100.add(jbAssistiThe100);
		panelgotham.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		
		
		panelgotham.setBackground(new Color(51, 0, 51));
		panelgotham.setBounds(490, 36, 150, 398);
		getContentPane().add(panelgotham);
		panelgotham.setLayout(null);
		
		JLabel gotham = new JLabel("");
		gotham.setIcon(new ImageIcon(serie.class.getResource("/Gotham.jpg")));
		gotham.setBounds(24, 23, 100, 150);
		panelgotham.add(gotham);
		
		
		jlGotham.setHorizontalAlignment(SwingConstants.CENTER);
		jlGotham.setForeground(Color.WHITE);
		jlGotham.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlGotham.setBounds(0, 181, 150, 14);
		panelgotham.add(jlGotham);
		
		jcbTemporadaGotham.setModel(new DefaultComboBoxModel(new String[] {"Temporada", "1\u00AA temporada", "2\u00AA temporada"}));
		jcbTemporadaGotham.setForeground(Color.WHITE);
		jcbTemporadaGotham.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jcbTemporadaGotham.setBackground(new Color(51, 0, 51));
		jcbTemporadaGotham.setBounds(24, 226, 118, 20);
		panelgotham.add(jcbTemporadaGotham);
		
		JComboBox jcbEpisodioGotham = new JComboBox();
		jcbEpisodioGotham.setModel(new DefaultComboBoxModel(new String[] {"Episodios", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22"}));
		jcbEpisodioGotham.setForeground(Color.WHITE);
		jcbEpisodioGotham.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jcbEpisodioGotham.setBackground(new Color(51, 0, 51));
		jcbEpisodioGotham.setBounds(24, 256, 100, 20);
		panelgotham.add(jcbEpisodioGotham);
		
		JButton jbAssistiGotham = new JButton("Assistido");
		jbAssistiGotham.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jbAssistiGotham.setForeground(Color.WHITE);
		jbAssistiGotham.setFont(new Font("Tahoma", Font.BOLD, 11));
		jbAssistiGotham.setFocusPainted(false);
		jbAssistiGotham.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jbAssistiGotham.setBackground(new Color(51, 0, 51));
		jbAssistiGotham.setBounds(24, 286, 89, 23);
		panelgotham.add(jbAssistiGotham);
		paneltwd.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		
		
		paneltwd.setBackground(new Color(102, 51, 0));
		paneltwd.setBounds(650, 36, 150, 398);
		getContentPane().add(paneltwd);
		paneltwd.setLayout(null);
		
		JLabel twd = new JLabel("");
		twd.setIcon(new ImageIcon(serie.class.getResource("/the-walking-dead.jpg")));
		twd.setBounds(24, 22, 100, 150);
		paneltwd.add(twd);
		
		
		jlTWD.setHorizontalAlignment(SwingConstants.CENTER);
		jlTWD.setForeground(Color.WHITE);
		jlTWD.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlTWD.setBounds(0, 180, 150, 14);
		paneltwd.add(jlTWD);
		
		JComboBox jcbTemporadaTWD = new JComboBox();
		jcbTemporadaTWD.setModel(new DefaultComboBoxModel(new String[] {"Temporada", "1\u00AA temporada", "2\u00AA temporada", "3\u00AA temporada", "4\u00AA temporada ", "5\u00AA temporada", "6\u00AA temporada"}));
		jcbTemporadaTWD.setForeground(Color.WHITE);
		jcbTemporadaTWD.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jcbTemporadaTWD.setBackground(new Color(102, 51, 0));
		jcbTemporadaTWD.setBounds(24, 225, 118, 20);
		paneltwd.add(jcbTemporadaTWD);
		
		JComboBox jcbEpisodioTWD = new JComboBox();
		jcbEpisodioTWD.setModel(new DefaultComboBoxModel(new String[] {"Episodios", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"}));
		jcbEpisodioTWD.setForeground(Color.WHITE);
		jcbEpisodioTWD.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jcbEpisodioTWD.setBackground(new Color(102, 51, 0));
		jcbEpisodioTWD.setBounds(24, 255, 100, 20);
		paneltwd.add(jcbEpisodioTWD);
		
		JButton jbAssistiTWD = new JButton("Assistido");
		jbAssistiTWD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jbAssistiTWD.setForeground(Color.WHITE);
		jbAssistiTWD.setFont(new Font("Tahoma", Font.BOLD, 11));
		jbAssistiTWD.setFocusPainted(false);
		jbAssistiTWD.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jbAssistiTWD.setBackground(new Color(102, 51, 0));
		jbAssistiTWD.setBounds(24, 285, 89, 23);
		paneltwd.add(jbAssistiTWD);
		panelrobot.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		
		
		panelrobot.setBackground(new Color(153, 0, 0));
		panelrobot.setBounds(810, 36, 150, 398);
		getContentPane().add(panelrobot);
		panelrobot.setLayout(null);
		
		JLabel robot = new JLabel("");
		robot.setIcon(new ImageIcon(serie.class.getResource("/mr-robot.jpg")));
		robot.setBounds(24, 21, 100, 150);
		panelrobot.add(robot);
		
		
		jlMrRobot.setHorizontalAlignment(SwingConstants.CENTER);
		jlMrRobot.setForeground(Color.WHITE);
		jlMrRobot.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlMrRobot.setBounds(0, 179, 150, 14);
		panelrobot.add(jlMrRobot);
		
		JComboBox jcbTemporadaRobot = new JComboBox();
		jcbTemporadaRobot.setModel(new DefaultComboBoxModel(new String[] {"Temporada", "1\u00AA temporada"}));
		jcbTemporadaRobot.setForeground(Color.WHITE);
		jcbTemporadaRobot.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jcbTemporadaRobot.setBackground(new Color(153, 0, 0));
		jcbTemporadaRobot.setBounds(24, 224, 118, 20);
		panelrobot.add(jcbTemporadaRobot);
		
		JComboBox jcbEpisodioRobot = new JComboBox();
		jcbEpisodioRobot.setModel(new DefaultComboBoxModel(new String[] {"Episodios", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		jcbEpisodioRobot.setForeground(Color.WHITE);
		jcbEpisodioRobot.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jcbEpisodioRobot.setBackground(new Color(153, 0, 0));
		jcbEpisodioRobot.setBounds(24, 254, 100, 20);
		panelrobot.add(jcbEpisodioRobot);
		
		JButton jbAssistiRobot = new JButton("Assistido");
		jbAssistiRobot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		jbAssistiRobot.setForeground(Color.WHITE);
		jbAssistiRobot.setFont(new Font("Tahoma", Font.BOLD, 11));
		jbAssistiRobot.setFocusPainted(false);
		jbAssistiRobot.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jbAssistiRobot.setBackground(new Color(153, 0, 0));
		jbAssistiRobot.setBounds(24, 284, 89, 23);
		panelrobot.add(jbAssistiRobot);
		
		
		
		
		jbProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ser2.setVisible(true);
				panelarrow.setVisible(false);
				panelflash.setVisible(false);
				panelsupergirl.setVisible(false);
				panellegends.setVisible(false);
				paneldemolidor.setVisible(false);
				panelgrimm.setVisible(false);
				jcbSeries.setVisible(false);
				jcbEscolha.setVisible(false);
				ser2.jbAnterior.setVisible(true);
				ser2.panelgame.setVisible(true);
				ser2.panelsupernatural.setVisible(true);
				ser2.panelthe100.setVisible(true);
				ser2.panelgotham.setVisible(true);
				ser2.paneltwd.setVisible(true);
				ser2.panelrobot.setVisible(true);
				jbProximo.setVisible(false);
				
			}
		});
		jbProximo.setHorizontalTextPosition(SwingConstants.LEFT);
		jbProximo.setIcon(new ImageIcon(serie.class.getResource("/seta2.png")));
		jbProximo.setHorizontalAlignment(SwingConstants.LEFT);
		jbProximo.setFocusPainted(false);
		jbProximo.setForeground(Color.WHITE);
		jbProximo.setBackground(Color.BLACK);
		contentPane.add(jbProximo);
		jlLogo.setIcon(new ImageIcon(serie.class.getResource("/logo2.png")));
		jlFundoArrow.setIcon(new ImageIcon(serie.class.getResource("/painelarrow.png")));
		
		
		jlLogo.setBounds(238, 141, 500, 102);
		jlFundoArrow.setBounds(0, -35, 989, 570);
		
		contentPane.add(jlLogo);
	
		contentPane.add(jlResumoArrow);
		contentPane.add(jlResumoFlash);
		contentPane.add(jlResumoSupergirl);
		contentPane.add(jlResumoDemolidor);
		contentPane.add(jlResumoGrimm);
		contentPane.add(jlResumoGotham);
		contentPane.add(jlResumoTWD);
		contentPane.add(jlResumoGOT);
		contentPane.add(jlResumoSPN);
		contentPane.add(jlResumoLegends);
		contentPane.add(jlResumoThe100);
		contentPane.add(jlResumoMrRobot);
		contentPane.add(jlFundoArrow);

		
		
		

		
	}
}
