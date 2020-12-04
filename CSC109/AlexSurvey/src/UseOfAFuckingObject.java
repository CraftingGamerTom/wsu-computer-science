
public class UseOfAFuckingObject {

    private String collegeChoice; 
    private int ageInput;
    private String genderRadioButton; 
    private int hasJob;
    private int hasChildren; 
    private int hasPC; 
    
    public UseOfAFuckingObject (String collegeChoice, int ageInput, String genderRadioButton, int hasJob, int hasChildren, int hasPC) {
        this.setCollegeChoice(collegeChoice);
        this.setAgeInput(ageInput);
        this.setGenderRadioButton(genderRadioButton);
        this.setHasJob(hasJob);
        this.setHasChildren(hasChildren);
        this.setHasPC(hasPC);
    }

    /**
     * @return the collegeChoice
     */
    public String getCollegeChoice() {
        return collegeChoice;
    }

    /**
     * @param collegeChoice the collegeChoice to set
     */
    public void setCollegeChoice(String collegeChoice) {
        this.collegeChoice = collegeChoice;
    }

    /**
     * @return the ageInput
     */
    public int getAgeInput() {
        return ageInput;
    }

    /**
     * @param ageInput the ageInput to set
     */
    public void setAgeInput(int ageInput) {
        this.ageInput = ageInput;
    }

    /**
     * @return the genderRadioButton
     */
    public String getGenderRadioButton() {
        return genderRadioButton;
    }

    /**
     * @param genderRadioButton the genderRadioButton to set
     */
    public void setGenderRadioButton(String genderRadioButton) {
        this.genderRadioButton = genderRadioButton;
    }

    /**
     * @return the hasJob
     */
    public int getHasJob() {
        return hasJob;
    }

    /**
     * @param hasJob the hasJob to set
     */
    public void setHasJob(int hasJob) {
        this.hasJob = hasJob;
    }

    /**
     * @return the hasChildren
     */
    public int getHasChildren() {
        return hasChildren;
    }

    /**
     * @param hasChildren the hasChildren to set
     */
    public void setHasChildren(int hasChildren) {
        this.hasChildren = hasChildren;
    }

    /**
     * @return the hasPC
     */
    public int getHasPC() {
        return hasPC;
    }

    /**
     * @param hasPC the hasPC to set
     */
    public void setHasPC(int hasPC) {
        this.hasPC = hasPC;
    }
    
}
