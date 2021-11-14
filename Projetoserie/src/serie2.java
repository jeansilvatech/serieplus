import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

 public class serie2 extends JInternalFrame {

	JPanel panelgame = new JPanel();
	JPanel panelsupernatural = new JPanel();
	JPanel panelthe100 = new JPanel();
	JPanel panelgotham = new JPanel();
	JPanel paneltwd = new JPanel();
	JPanel panelrobot = new JPanel();
	
	public static JButton jbAnterior = new JButton("Anterior");
	
	public serie2() {
		setBorder(null);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setLayout(null);
		setBounds(0, 0, 990, 570);
		panelgame.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panelgame.setBackground(new Color(0, 0, 51));
		panelgame.setBounds(10, 36, 150, 398);
		getContentPane().add(panelgame);
		panelgame.setLayout(null);
		jbAnterior.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				jbAnterior.setBackground(Color.WHITE);
				jbAnterior.setForeground(Color.BLACK);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				jbAnterior.setBackground(Color.BLACK);
				jbAnterior.setForeground(Color.WHITE);
			}
		});
		jbAnterior.setVisible(false);
		
		JLabel got = new JLabel("");
		got.setIcon(new ImageIcon(serie.class.getResource("/game-of-thrones.jpg")));
		got.setBounds(24, 27, 100, 150);
		panelgame.add(got);
		
		JLabel jlGOT = new JLabel("Game of Thrones");
		jlGOT.setHorizontalAlignment(SwingConstants.CENTER);
		jlGOT.setForeground(Color.WHITE);
		jlGOT.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlGOT.setBounds(0, 185, 150, 14);
		panelgame.add(jlGOT);
		
		JComboBox jcbTemporadaGa = new JComboBox();
		jcbTemporadaGa.setModel(new DefaultComboBoxModel(new String[] {"Temporada", "1\u00AA temporada", "2\u00AA temporada", "3\u00AA temporada", "4\u00AA temporada", "5 temporada", "6\u00AA temporada"}));
		jcbTemporadaGa.setForeground(Color.WHITE);
		jcbTemporadaGa.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jcbTemporadaGa.setBackground(new Color(0, 0, 51));
		jcbTemporadaGa.setBounds(24, 230, 118, 20);
		panelgame.add(jcbTemporadaGa);
		
		JComboBox jcbEpisodioGa = new JComboBox();
		jcbEpisodioGa.setModel(new DefaultComboBoxModel(new String[] {"Episodios", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		jcbEpisodioGa.setForeground(Color.WHITE);
		jcbEpisodioGa.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jcbEpisodioGa.setBackground(new Color(0, 0, 51));
		jcbEpisodioGa.setBounds(24, 260, 100, 20);
		panelgame.add(jcbEpisodioGa);
		
		JButton jbAssistiGOT = new JButton("Assistido");
		jbAssistiGOT.setForeground(Color.WHITE);
		jbAssistiGOT.setFont(new Font("Tahoma", Font.BOLD, 11));
		jbAssistiGOT.setFocusPainted(false);
		jbAssistiGOT.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jbAssistiGOT.setBackground(new Color(0, 0, 51));
		jbAssistiGOT.setBounds(24, 290, 89, 23);
		panelgame.add(jbAssistiGOT);
		panelsupernatural.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		
		
		panelsupernatural.setBackground(new Color(102, 102, 0));
		panelsupernatural.setBounds(170, 36, 150, 398);
		getContentPane().add(panelsupernatural);
		panelsupernatural.setLayout(null);
		
		JLabel supernatural = new JLabel("");
		supernatural.setIcon(new ImageIcon(serie.class.getResource("/Supernatural.jpg")));
		supernatural.setBounds(24, 24, 100, 150);
		panelsupernatural.add(supernatural);
		
		JLabel jlSupernatural = new JLabel("Supernatural");
		jlSupernatural.setHorizontalAlignment(SwingConstants.CENTER);
		jlSupernatural.setForeground(Color.WHITE);
		jlSupernatural.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlSupernatural.setBounds(0, 182, 150, 14);
		panelsupernatural.add(jlSupernatural);
		
		JComboBox jcbTemporadaSu = new JComboBox();
		jcbTemporadaSu.setModel(new DefaultComboBoxModel(new String[] {"Temporada", "1\u00AA temporada", "2\u00AA temporada", "3\u00AA temporada", "4\u00AA temporada", "5\u00AA temporada", "6\u00AA temporada", "7\u00AA temporada", "8\u00AA temporada", "9\u00AA temporada", "10\u00AA temporada", "11\u00AA temporada"}));
		jcbTemporadaSu.setForeground(Color.WHITE);
		jcbTemporadaSu.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jcbTemporadaSu.setBackground(new Color(102, 102, 0));
		jcbTemporadaSu.setBounds(24, 227, 118, 20);
		panelsupernatural.add(jcbTemporadaSu);
		
		JComboBox jcbEpisodioSu = new JComboBox();
		jcbEpisodioSu.setModel(new DefaultComboBoxModel(new String[] {"Episodios", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		jcbEpisodioSu.setForeground(Color.WHITE);
		jcbEpisodioSu.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jcbEpisodioSu.setBackground(new Color(102, 102, 0));
		jcbEpisodioSu.setBounds(24, 257, 100, 20);
		panelsupernatural.add(jcbEpisodioSu);
		
		JButton jbAssistiSPN = new JButton("Assistido");
		jbAssistiSPN.setForeground(Color.WHITE);
		jbAssistiSPN.setFont(new Font("Tahoma", Font.BOLD, 11));
		jbAssistiSPN.setFocusPainted(false);
		jbAssistiSPN.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jbAssistiSPN.setBackground(new Color(102, 102, 0));
		jbAssistiSPN.setBounds(24, 287, 89, 23);
		panelsupernatural.add(jbAssistiSPN);
		panelthe100.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		
		
		panelthe100.setBackground(new Color(0, 102, 153));
		panelthe100.setBounds(330, 36, 150, 398);
		getContentPane().add(panelthe100);
		panelthe100.setLayout(null);
		
		JLabel the100 = new JLabel("");
		the100.setIcon(new ImageIcon(serie.class.getResource("/the-100.jpg")));
		the100.setBounds(24, 22, 100, 150);
		panelthe100.add(the100);
		
		JLabel jlThe100 = new JLabel("The 100");
		jlThe100.setHorizontalAlignment(SwingConstants.CENTER);
		jlThe100.setForeground(Color.WHITE);
		jlThe100.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlThe100.setBounds(0, 180, 150, 14);
		panelthe100.add(jlThe100);
		
		JComboBox jcbTemporadaT = new JComboBox();
		jcbTemporadaT.setModel(new DefaultComboBoxModel(new String[] {"Temporada", "1\u00AA temporada", "2\u00AA temporada", "3\u00AA temporada"}));
		jcbTemporadaT.setForeground(Color.WHITE);
		jcbTemporadaT.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jcbTemporadaT.setBackground(new Color(0, 102, 153));
		jcbTemporadaT.setBounds(24, 225, 118, 20);
		panelthe100.add(jcbTemporadaT);
		
		JComboBox jcbEpisodioT = new JComboBox();
		jcbEpisodioT.setModel(new DefaultComboBoxModel(new String[] {"Episodios", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"}));
		jcbEpisodioT.setForeground(Color.WHITE);
		jcbEpisodioT.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jcbEpisodioT.setBackground(new Color(0, 102, 153));
		jcbEpisodioT.setBounds(24, 255, 100, 20);
		panelthe100.add(jcbEpisodioT);
		
		JButton jbAssistiThe100 = new JButton("Assistido");
		jbAssistiThe100.setForeground(Color.WHITE);
		jbAssistiThe100.setFont(new Font("Tahoma", Font.BOLD, 11));
		jbAssistiThe100.setFocusPainted(false);
		jbAssistiThe100.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jbAssistiThe100.setBackground(new Color(0, 102, 153));
		jbAssistiThe100.setBounds(24, 285, 89, 23);
		panelthe100.add(jbAssistiThe100);
		panelgotham.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		
		
		panelgotham.setBackground(new Color(51, 0, 51));
		panelgotham.setBounds(490, 36, 150, 398);
		getContentPane().add(panelgotham);
		panelgotham.setLayout(null);
		
		JLabel gotham = new JLabel("");
		gotham.setIcon(new ImageIcon(serie.class.getResource("/Gotham.jpg")));
		gotham.setBounds(24, 23, 100, 150);
		panelgotham.add(gotham);
		
		JLabel jlGotham = new JLabel("Gotham");
		jlGotham.setHorizontalAlignment(SwingConstants.CENTER);
		jlGotham.setForeground(Color.WHITE);
		jlGotham.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlGotham.setBounds(0, 181, 150, 14);
		panelgotham.add(jlGotham);
		
		JComboBox jcbTemporadaGo = new JComboBox();
		jcbTemporadaGo.setModel(new DefaultComboBoxModel(new String[] {"Temporada", "1\u00AA temporada", "2\u00AA temporada"}));
		jcbTemporadaGo.setForeground(Color.WHITE);
		jcbTemporadaGo.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jcbTemporadaGo.setBackground(new Color(51, 0, 51));
		jcbTemporadaGo.setBounds(24, 226, 118, 20);
		panelgotham.add(jcbTemporadaGo);
		
		JComboBox jcbEpisodioGo = new JComboBox();
		jcbEpisodioGo.setModel(new DefaultComboBoxModel(new String[] {"Episodios", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22"}));
		jcbEpisodioGo.setForeground(Color.WHITE);
		jcbEpisodioGo.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jcbEpisodioGo.setBackground(new Color(51, 0, 51));
		jcbEpisodioGo.setBounds(24, 256, 100, 20);
		panelgotham.add(jcbEpisodioGo);
		
		JButton jbAssistiGotham = new JButton("Assistido");
		jbAssistiGotham.setForeground(Color.WHITE);
		jbAssistiGotham.setFont(new Font("Tahoma", Font.BOLD, 11));
		jbAssistiGotham.setFocusPainted(false);
		jbAssistiGotham.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jbAssistiGotham.setBackground(new Color(51, 0, 51));
		jbAssistiGotham.setBounds(24, 286, 89, 23);
		panelgotham.add(jbAssistiGotham);
		paneltwd.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		
		
		paneltwd.setBackground(new Color(102, 51, 0));
		paneltwd.setBounds(650, 36, 150, 398);
		getContentPane().add(paneltwd);
		paneltwd.setLayout(null);
		
		JLabel twd = new JLabel("");
		twd.setIcon(new ImageIcon(serie.class.getResource("/the-walking-dead.jpg")));
		twd.setBounds(24, 22, 100, 150);
		paneltwd.add(twd);
		
		JLabel jlTWD = new JLabel("The Walking Dead");
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
		jbAssistiTWD.setForeground(Color.WHITE);
		jbAssistiTWD.setFont(new Font("Tahoma", Font.BOLD, 11));
		jbAssistiTWD.setFocusPainted(false);
		jbAssistiTWD.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jbAssistiTWD.setBackground(new Color(102, 51, 0));
		jbAssistiTWD.setBounds(24, 285, 89, 23);
		paneltwd.add(jbAssistiTWD);
		panelrobot.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		
		
		panelrobot.setBackground(new Color(153, 0, 0));
		panelrobot.setBounds(810, 36, 150, 398);
		getContentPane().add(panelrobot);
		panelrobot.setLayout(null);
		
		JLabel robot = new JLabel("");
		robot.setIcon(new ImageIcon(serie.class.getResource("/mr-robot.jpg")));
		robot.setBounds(24, 21, 100, 150);
		panelrobot.add(robot);
		
		JLabel jlMrRobot = new JLabel("Mr. Robot");
		jlMrRobot.setHorizontalAlignment(SwingConstants.CENTER);
		jlMrRobot.setForeground(Color.WHITE);
		jlMrRobot.setFont(new Font("Tahoma", Font.BOLD, 11));
		jlMrRobot.setBounds(0, 179, 150, 14);
		panelrobot.add(jlMrRobot);
		
		JComboBox jcbTemporadaM = new JComboBox();
		jcbTemporadaM.setModel(new DefaultComboBoxModel(new String[] {"Temporada", "1\u00AA temporada"}));
		jcbTemporadaM.setForeground(Color.WHITE);
		jcbTemporadaM.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jcbTemporadaM.setBackground(new Color(153, 0, 0));
		jcbTemporadaM.setBounds(24, 224, 118, 20);
		panelrobot.add(jcbTemporadaM);
		
		JComboBox jcbEpisodioM = new JComboBox();
		jcbEpisodioM.setModel(new DefaultComboBoxModel(new String[] {"Episodios", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		jcbEpisodioM.setForeground(Color.WHITE);
		jcbEpisodioM.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jcbEpisodioM.setBackground(new Color(153, 0, 0));
		jcbEpisodioM.setBounds(24, 254, 100, 20);
		panelrobot.add(jcbEpisodioM);
		
		JButton jbAssistiRobot = new JButton("Assistido");
		jbAssistiRobot.setForeground(Color.WHITE);
		jbAssistiRobot.setFont(new Font("Tahoma", Font.BOLD, 11));
		jbAssistiRobot.setFocusPainted(false);
		jbAssistiRobot.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.WHITE));
		jbAssistiRobot.setBackground(new Color(153, 0, 0));
		jbAssistiRobot.setBounds(24, 284, 89, 23);
		panelrobot.add(jbAssistiRobot);
		
		jbAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				serie.panelarrow.setVisible(true);
				serie.panelflash.setVisible(true);
				serie.panelsupergirl.setVisible(true);
				serie.panellegends.setVisible(true);
				serie.paneldemolidor.setVisible(true);
				serie.panelgrimm.setVisible(true);
				serie.jcbSeries.setVisible(true);
				serie.jcbEscolha.setVisible(true);
				jbAnterior.setVisible(false);
				serie.jbProximo.setVisible(true);
				
				panelgame.setVisible(false);
				panelsupernatural.setVisible(false);
				panelthe100.setVisible(false);
				panelgotham.setVisible(false);
				paneltwd.setVisible(false);
				panelrobot.setVisible(false);
			}
		});
		jbAnterior.setFocusPainted(false);
		jbAnterior.setIcon(new ImageIcon(serie.class.getResource("/seta1.png")));
		jbAnterior.setBackground(Color.BLACK);
		jbAnterior.setForeground(Color.WHITE);
		jbAnterior.setBounds(10, 445, 110, 25);
		getContentPane().add(jbAnterior);

	}

}

