import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bickerstaff2
 */
public class Survey extends JFrame {

    JPanel panel;
    
    JRadioButton male;
    JRadioButton female;
    ButtonGroup sexButtons;
    JTextField ageInput;
    JCheckBox work;
    JCheckBox kids;
    JCheckBox computer;
    String majorSelection;
    JComboBox major;
    String gender;
    boolean workBool;
    boolean kidsBool;
    boolean compBool;
    File defaultName = new File("studentsurvey.txt");
    FileWriter fw;
    ArrayList<String> fileRead = new ArrayList<String>();
    String resultWrite;
    final String TITLE = "college, age, sex, work, have children, own pc \r\n";
    int workAns;
    int kidsAns;
    int compAns;
    int age;
    String sex;
    JFileChooser chooser = new JFileChooser();

    private String newAge;
    private String newMajor;
    private String newSex;
    private int newJob;
    private int newKids;
    private int newPC;
    private String a1;
    private String m1;
    private String s1;
    private String j1;
    private String k1;
    private String p1;
    private String combo;

    public Survey() {

        createGUI();

    }

    public JPanel age() {
        panel = new JPanel();
        Border raisedBorder = BorderFactory.createRaisedBevelBorder();
        panel.setBorder(raisedBorder);
        JLabel age = new JLabel("Age: ");
        ageInput = new JTextField(3);
        panel.add(age, BorderLayout.NORTH);
        panel.add(ageInput, BorderLayout.NORTH);
        return panel;
    }

    public JPanel major() {
        panel = new JPanel();
        panel.setBorder(new TitledBorder(new EtchedBorder(), "College"));
        major = new JComboBox();
        major.addItem("Biology");
        major.addItem("Chemistry");
        major.addItem("Computer Science");
        major.addItem("Engineering");
        panel.add(major);
        return panel;
    }

    public JPanel sex() {
        panel = new JPanel();
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        sexButtons = new ButtonGroup();
        sexButtons.add(male);
        sexButtons.add(female);
        panel.setLayout(new GridLayout(2, 1));
        panel.add(male, BorderLayout.NORTH);
        panel.add(female, BorderLayout.SOUTH);
        return panel;
    }

    public JPanel options() {
        panel = new JPanel();
        work = new JCheckBox("Work");
        kids = new JCheckBox("Have Children");
        computer = new JCheckBox("Own PC");
        panel.setLayout(new GridLayout(3, 1));
        panel.add(work);
        panel.add(kids);
        panel.add(computer);
        return panel;
    }

    public JPanel finish() {
        panel = new JPanel();
        JButton finish = new JButton("Finish");
        ActionListener finishButton = new finishFile();
        finish.addActionListener(finishButton);
        panel.add(finish);
        return panel;
    }

    public JMenu fileMenu() {
        JMenu file = new JMenu("File");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem quit = new JMenuItem("Quit");
        ActionListener exit = new Survey.exitGUI();
        ActionListener saver = new saveFile();
        ActionListener opener = new openFile();
        open.addActionListener(opener);
        save.addActionListener(saver);
        quit.addActionListener(exit);
        file.add(open);
        file.add(save);
        file.add(quit);
        return file;
    }

    public JMenu drawMenu() {
        JMenu draw = new JMenu("Draw");
        JMenuItem work = new JMenuItem("Work");
        JMenuItem children = new JMenuItem("Children");
        JMenuItem computer = new JMenuItem("Own PC");
        ActionListener drawWork = new drawWork();
        work.addActionListener(drawWork);
        draw.add(work);
        draw.add(children);
        draw.add(computer);
        return draw;
    }

    public void createGUI() {

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(fileMenu());
        menuBar.add(drawMenu());

        JPanel ageInput = new JPanel();
        ageInput.add(age());

        JPanel centerPanel = new JPanel();
        centerPanel.add(major());
        centerPanel.add(sex());
        centerPanel.add(options());

        JPanel finishButton = new JPanel();
        finishButton.add(finish());

        add(ageInput, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(finishButton, BorderLayout.SOUTH);

        setSize(600, 400);
        setTitle("Student Survey");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    class exitGUI implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent quit) {
            System.exit(0);
        }

    }

    class finishFile implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                Scanner in = new Scanner(defaultName);
                if (in.hasNextLine()) {

                    in.nextLine();
                    while (in.hasNextLine()) {
                        String adder;
                        adder = in.nextLine();
                        fileRead.add(adder);
                    }
                }

                fileRead.add(recieveString());
            } catch (FileNotFoundException readError) {
                System.out.println("An error occured while reading the file");
            }

            try {
                fw = new FileWriter(defaultName);
                fw.write(TITLE);
                for (String a : fileRead) {
                    fw.write(a);
                    fw.write("\r\n");
                }

                fw.flush();
                fw.close();
            } catch (IOException writeError) {
                System.out.println("An error occured while writing your file");
            }
            resetValues();

        }

    }

    class saveFile implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent saver) {
            chooser.showSaveDialog(Survey.this);
            try {
                if (defaultName.exists()) {
                    Scanner in = new Scanner(defaultName);
                    if (in.hasNextLine()) {

                        in.nextLine();
                        while (in.hasNextLine()) {
                            String adder;
                            adder = in.nextLine();
                            fileRead.add(adder);
                        }
                    }
                }

                fileRead.add(recieveString());
            } catch (FileNotFoundException readError) {
                System.out.println("An error occured while reading the file");
            }

            try {
                fw = new FileWriter(defaultName);
                fw.write(TITLE);
                for (String a : fileRead) {
                    fw.write(a);
                    fw.write("\r\n");
                }

                fw.flush();
                fw.close();
            } catch (IOException writeError) {
                System.out.println("An error occured while writing your file");
            }
            resetValues();

        }

    }

    class openFile implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            chooser.showOpenDialog(Survey.this);
            File file = chooser.getSelectedFile();
            defaultName = file;

        }

    }

    class drawWork implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            BarChart chart = new BarChart();
            chart.hasWorkFrequency(defaultName);
        }

    }

    private String recieveString() {
        boolean catcher = true;
        try {
            age = Integer.parseInt(ageInput.getText());
        } catch (IllegalFormatException ex) {
            catcher = false;
            System.out.println("Not an integer. Please try again");
        }

        majorSelection = major.getSelectedItem().toString();

        if (male.isSelected()) {
            sex = "Male";
        } else if (female.isSelected()) {
            sex = "Female";
        } else {
            sex = "";
            catcher = false;
        }

        if (work.isSelected()) {
            workAns = 1;
        } else {
            workAns = 0;
        }

        if (kids.isSelected()) {
            kidsAns = 1;
        } else {
            kidsAns = 0;
        }

        if (computer.isSelected()) {
            compAns = 1;
        } else {
            compAns = 0;
        }

        if (catcher) {

            resultWrite = Results(age, majorSelection, sex, workAns, kidsAns, compAns);

        } else {
            System.out.println("Please ensure all fields are filled out properly");
        }

        return resultWrite;
    }

    public String Results(int age, String majorSelection, String sex, int workAns, int kidsAns, int compAns) {
        String returnAns;
        setAge(Integer.toString(age));
        setMajor(majorSelection);
        setSex(sex);
        setWork(workAns);
        setKids(kidsAns);
        setPC(compAns);
        m1 = getMajor();
        a1 = getAge();
        s1 = getSex();
        j1 = Integer.toString(getWork());
        k1 = Integer.toString(getKids());
        p1 = Integer.toString(getPC());
        String comp = m1 + ", " + a1 + ", " + s1 + ", "
                + j1 + ", " + k1 + ", " + p1;
        returnAns = comp;
        return returnAns;

    }


    public void resetValues() {
        ageInput.setText("");
        major.setSelectedIndex(0);
        sexButtons.clearSelection();
        work.setSelected(false);
        kids.setSelected(false);
        computer.setSelected(false);
    }

    public static void main(String[] args) {
        Survey studentSurvey = new Survey();

    }
}
