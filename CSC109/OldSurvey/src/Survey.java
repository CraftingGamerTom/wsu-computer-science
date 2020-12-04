import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Survey extends JFrame{

    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;
    
    JPanel comboPanel;
    JPanel agePanel;
    JPanel genderPanel;
    JPanel frequencyPanel;
    JPanel finishPanel;
    
    JTextField ageTextField;
    JRadioButton maleButton;
    JRadioButton femaleButton;
    JComboBox<String> majorChoice;
    JCheckBox workBox;
    JCheckBox kidsBox;
    JCheckBox pcBox;
    
    File csvFile = new File("studentsurvey.txt"); 
    
    public static String genderRadioButton;
    public static int ageInput;
    public static String collegeChoice;
    public static int hasJob;
    public static int hasChildren;
    public static int hasPC;
    
    private ArrayList<Response> allResponses;
    
    static final String TITLE_OF_FILE = "college, age, sex, work, have children, own pc"; //Could be added to top of file
    
    private final static int FRAME_WIDTH = 500;
    private final static int FRAME_HEIGHT = 250;
    
    private final static int GRAPH_FRAME_WIDTH = 600;
    private final static int GRAPH_FRAME_HEIGHT = 500;

    /**
     * Creates a Survey window and handles survey files.
     */
    public Survey() {
        
        JPanel centerPanel = new JPanel();
        centerPanel.add(createMajorChoicePanel());
        centerPanel.add(createGenderPanel());
        centerPanel.add(createFrequencyPanel());
        
        JPanel northPanel = new JPanel();
        northPanel.add(createAgeTextPanel());
        
        JPanel southPanel = new JPanel();
        southPanel.add(createFinishPanel());
        
        add(centerPanel, BorderLayout.CENTER);
        add(northPanel, BorderLayout.NORTH);
        add(southPanel, BorderLayout.SOUTH);
        
        //Creates JMenuBar and sets it to the frame.
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        //Creates and Adds Menu's to Menu Bar.
        menuBar.add(createFileMenu());
        menuBar.add(createDrawMenu());
        
        //Initializes the survey that opens on start
        allResponses = new ArrayList<Response>();
        if (csvFile.exists()) {
        setAllResponses();
        }

        
    }
    /*
     * START JPANELS --------------------------------------------------------------------------------
     */
    /**
     * Creates a The Major Choice JPanel.
     * @return comboPanel a JPanel containing a drop down menu, major choices, and border.
     */
    public JPanel createMajorChoicePanel() {
        //Creates JComboBox
        String[] majors = {"Computer Science", "Engineering", "Biology", "Chemistry"};
        majorChoice = new JComboBox<String>(majors);
        majorChoice.setSelectedIndex(0);
        majorChoice.setSize(50, 25);
        majorChoice.setBorder(new TitledBorder(new EtchedBorder(), "College"));
        //Creates JPanel and adds JComboBox
        comboPanel = new JPanel();
        comboPanel.setSize(50, 25);
        comboPanel.add(majorChoice);
        getContentPane().add(BorderLayout.NORTH, comboPanel);

        
        //majorChoice.addActionListener(actionName);
        return comboPanel;
    }

    /**
     * Creates a Text Panel that allows for user input
     * @return agePanel a JPanel containing the text field, label, andd beveled border
     */
    public JPanel createAgeTextPanel() {
     agePanel = new JPanel(); // Uses FlowLayout by default.
     agePanel.add(new JLabel("Age: "));
     ageTextField = new JTextField(10);
     agePanel.add(ageTextField);
     agePanel.setSize(50, 25);
     agePanel.setBorder(new BevelBorder(0));
     getContentPane().add(BorderLayout.NORTH, agePanel);
     return agePanel;
    }
    
    /**
     * Creates two buttons inside a JPanel. In the future it is best to use a Button Group.
     * @return genderPanel containing two radio buttons with labels
     */
    public JPanel createGenderPanel() {
        maleButton = new JRadioButton();
        maleButton.setText("Male");
        femaleButton = new JRadioButton();
        femaleButton.setText("Female");
        
        //Action Listeners
        MGenderListener maleListener = new MGenderListener();
        maleButton.addActionListener(maleListener);
        FGenderListener femaleListener = new FGenderListener();
        femaleButton.addActionListener(femaleListener);
        
        genderPanel = new JPanel();
        genderPanel.setLayout(new GridLayout(2,1));
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        
        return genderPanel;
    }
    /**
     * Creates a panel containing three Check Boxes (Work, Children, Own PC).
     * @return frequencyPanel with the Check Boxes and Labels
     */
    public JPanel createFrequencyPanel() {
        workBox = new JCheckBox("Work");
        kidsBox = new JCheckBox("Have Children");
        pcBox = new JCheckBox("Own PC");
        frequencyPanel = new JPanel();
        frequencyPanel.setLayout(new GridLayout(3,1));
        frequencyPanel.add(workBox);
        frequencyPanel.add(kidsBox);
        frequencyPanel.add(pcBox);
        return frequencyPanel;
    }
    /**
     * Creates the finish button 
     * @return finishButton to add survey information to the default file
     */
    public JPanel createFinishPanel() {
        finishPanel = new JPanel();
        JButton finishButton = new JButton("Finish");
        ActionListener finishListener = new FinishListener();
        finishButton.addActionListener(finishListener);
        finishPanel.add(finishButton);
        return finishPanel;
    }
    /**
     * Creates a JMenu for the File Menu. Contains Open, Save, and Exit.
     * @return menu JMenu.
     */
    public JMenu createFileMenu() {
        // Creates Menu
        JMenu menu = new JMenu("File");
        //Creates Items
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem quitItem = new JMenuItem("Quit");
        
        //Action Listeners
        ActionListener exitListener = new ExitItemListener();
        quitItem.addActionListener(exitListener);
        ActionListener saveListener = new SaveListener();
        saveItem.addActionListener(saveListener);
        ActionListener openListener = new OpenListener();
        openItem.addActionListener(openListener);
            //TO-DO: ADD LISTENERS FOR "openItem" AND "saveItem".
        //Adds Items to Menu
        menu.add(openItem);
        menu.add(saveItem);
        menu.add(quitItem);
        
        return menu;
    }
    /**
     *  Creates a Draw Menu containing options to draw frequency Bar Charts for different categories.
     *  ("Work, CHildren, and Own PC")
     * @return
     */
    public JMenu createDrawMenu() {
        JMenu menu = new JMenu("Draw");
        
        //Need to add action listeners to all these items.
        JMenuItem workFrequency = new JMenuItem("Work");
        JMenuItem kidFrequency = new JMenuItem("Children");
        JMenuItem pcFrequency = new JMenuItem("Own PC");
        
        // Action Listeners
        ActionListener workListener = new WorkFrequencyListener();
        workFrequency.addActionListener(workListener);
        ActionListener childrenListener = new ChildrenFrequencyListener();
        kidFrequency.addActionListener(childrenListener);
        ActionListener pcListener = new PCFrequencyListener();
        pcFrequency.addActionListener(pcListener);
        
        menu.add(workFrequency);
        menu.add(kidFrequency);
        menu.add(pcFrequency);
        
        return menu;
    }
    /*
     * BEGIN ACTION LISTENERS -----------------------------------------------------------------------
     */
    /**
     * Action Listener for switching the Radio Buttons.
     * @author TomRokickiii
     *
     */
    class MGenderListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if(femaleButton.isSelected()) {
                femaleButton.setSelected(false);
            }
        }
    }
    /**
     * Action Listener for switching the Radio Buttons.
     * @author TomRokickiii
     *
     */
    class FGenderListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if(maleButton.isSelected()) {
                maleButton.setSelected(false);
            }
        }
    }
    /**
     * Action Listener for opening a file when "Open" is selected.
     * @author TomRokickiii
     *
     */
    class OpenListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            allResponses.clear();
            JFileChooser fileChooser = new JFileChooser();
            if (fileChooser.showOpenDialog(Survey.this) == JFileChooser.APPROVE_OPTION) {
                  File file = fileChooser.getSelectedFile();
                  csvFile = file;
            }

            setAllResponses();
        }
    }
    /**
     * Action Listener for saving a file when "Save" is selected.
     * @author TomRokickiii
     *
     */
    class SaveListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            createCurrentResponse();
            try{
            
            JFileChooser fileChooser = new JFileChooser();
            if (fileChooser.showSaveDialog(Survey.this) == JFileChooser.APPROVE_OPTION) {
                  File file = fileChooser.getSelectedFile();
                  
                  FileWriter writer = new FileWriter(file);
                  saveInfoToFile(writer, allResponses);
                  writer.close();
            }
            
            }catch (IOException e){
                System.out.println("***File Writer could not find the file location.***");
            }
        }
    }
    /**
     * Action Listener for finishing a file when Finish Button is selected.
     * @author TomRokickiii
     *
     */
    class FinishListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            createCurrentResponse();
            try{
                System.out.println(csvFile.getAbsolutePath());
                FileWriter writer = new FileWriter(csvFile);
                saveInfoToFile(writer, allResponses);
                writer.close();
            }
            catch (IOException e){
                    System.out.println("***File Writer could not find the file location.***");
            }
        }
    }
    /**
     * Action Listener for exit a file when "Exit" is selected.
     * @author TomRokickiii
     *
     */
    class ExitItemListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.exit(0);
        }
    }
    /**
     * Action Listener for Work Frequency Bar Chart a file when "WorkFrequency" is selected.
     * @author TomRokickiii
     *
     */
    class WorkFrequencyListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JFrame jframe = new JFrame();
            jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            jframe.setSize(GRAPH_FRAME_WIDTH, GRAPH_FRAME_HEIGHT);
            jframe.setTitle("Work");

            Frequency pcTable = new Frequency(allResponses, 0);
            JComponent chart = new ChartComponent(pcTable.getFrequency());
            jframe.add(chart);
            
            jframe.setVisible(true);

        }
    }
    /**
     * Action Listener for Children Frequency Bar Chart a file when "ChildrenFrequency" is selected.
     * @author TomRokickiii
     *
     */
    class ChildrenFrequencyListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JFrame jframe = new JFrame();
            jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            jframe.setSize(GRAPH_FRAME_WIDTH, GRAPH_FRAME_HEIGHT);
            jframe.setTitle("Children");

            Frequency pcTable = new Frequency(allResponses, 1);
            JComponent chart = new ChartComponent(pcTable.getFrequency());
            jframe.add(chart);
            
            jframe.setVisible(true);

        }
    }
    /**
     * Action Listener for PC Frequency Bar Chart a file when "PCFrequency" is selected.
     * @author TomRokickiii
     *
     */
    class PCFrequencyListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JFrame jframe = new JFrame();
            jframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            jframe.setSize(GRAPH_FRAME_WIDTH, GRAPH_FRAME_HEIGHT);
            jframe.setTitle("PC");
            
            Frequency pcTable = new Frequency(allResponses, 2);
            JComponent chart = new ChartComponent(pcTable.getFrequency());
            jframe.add(chart);
            
            jframe.setVisible(true);
            
        }
    }
    /*
     * BEGIN UNKNOWN NAME ------------------------------------------
     */
    /**
     * Takes in the data from the survey and creates a new response. Then adds the response to the Response ArrayList.
     */
    public void createCurrentResponse() {
        boolean canSave = true;
        
        String gender;
        int work;
        int children;
        int pc;
        Integer age;
        
        try{
        age = Integer.parseInt(ageTextField.getText());
        }
        catch (NumberFormatException e){
            age = -1;
            canSave = false;
            System.out.println("NumberFormatException thrown due to no age entered.");
        }
        if (maleButton.isSelected()) {
            gender = "Male";
        }
        else if (femaleButton.isSelected()) {
            gender = "Female";
        }
        else{
            gender = "";
            canSave = false;
        }
        String major = majorChoice.getSelectedItem().toString();
        if (workBox.isSelected()) {
            work = 1;
        }else{
            work = 0;
        }
        if (kidsBox.isSelected()) {
            children = 1;
        }else{
            children = 0;
        }
        if (pcBox.isSelected()) {
            pc = 1;
        }else{
            pc = 0;
        }
        //Checks if it can save
        if (canSave) {
        Response aNewResponse = new Response(major, age, gender, work, children, pc);
        allResponses.add(aNewResponse);
        }
        else {
            System.out.println("Error during attempted creation of response.");
        }
    }
    /**
     * Takes in all the data from a file then saves each line as a Response in a Response ArrayList.
     */
    public void setAllResponses() {
        Scanner scanner;
        try {
            scanner = new Scanner(csvFile);
            scanner.useDelimiter(",|\n");
            String firstLine = scanner.nextLine();
            while(scanner.hasNext()){
                Response theResponse = new Response(
                        scanner.next(),     //College Choice
                        scanner.nextInt(),  //Age
                        scanner.next(),     //Gender
                        scanner.nextInt(),  //Has Job
                        scanner.nextInt(),  //Has Children
                        scanner.nextInt()); //Has PC
                allResponses.add(theResponse);
                
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    /**
     * Uses all the Responses from the Response ArrayList and writes them to a file, then saves.
     * @param writeIn The FileWriter initialized in the ActionListener.
     * @param allResponses The ArrayList of Responses.
     * @throws IOException A general Exception thrown. Sorry I did not handle it.
     */
    public void saveInfoToFile(FileWriter writeIn, ArrayList<Response> allResponses) throws IOException{
        
        writeIn.write(TITLE_OF_FILE);
        for (int index = 0; index<allResponses.size(); index++) {
        Response aResponse = allResponses.get(index);
        
        StringBuilder buildLine = new StringBuilder();
        buildLine.append("\n");
        buildLine.append(aResponse.getCollegeChoice());
        buildLine.append(",");
        buildLine.append(aResponse.getAgeInput());
        buildLine.append(",");
        buildLine.append(aResponse.getGenderRadioButton());
        buildLine.append(",");
        buildLine.append(aResponse.getHasJob());
        buildLine.append(",");
        buildLine.append(aResponse.getHasChildren());
        buildLine.append(",");
        buildLine.append(aResponse.getHasPC());
        
        writeIn.write(buildLine.toString());
        }
        
        try{
        writeIn.flush();
        }catch (IOException e) {
            System.out.println("Flushing Error");
        }
    }
    /*
     * BEGIN MAIN ARGUMENT ---------------------------------------------------------------
     */
    /**
     * Creates the Survey. Everything starts here.
     * @param args
     */
    public static void main(String[] args){
        JFrame frame = new Survey();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setFont(new Font("System", Font.PLAIN, 10));
        Font f = frame.getFont();
        FontMetrics fm = frame.getFontMetrics(f);
        int x = fm.stringWidth("Survey");
        int y = fm.stringWidth("            ");
        int z = frame.getWidth()/2 - (x/2);
        int w = z/y;
        String pad = "";
        pad = String.format("%"+w+"s", pad);
        frame.setTitle(pad + "Survey"); //TO-DO: FIX CENTERED
  
        frame.setVisible(true);
    }
}

