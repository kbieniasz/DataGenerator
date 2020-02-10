public class Participant {
    private int participantID;
    private String lastName;
    private String firstName;
    private String email;

    public Participant(int participantID, String lastName, String firstName, String email) {
        this.participantID = participantID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "exec [dbo].[PROC_AddParticipant] '" + lastName.replaceAll("\'","") + "', '" +
                firstName.replaceAll("\'","") + "','" + email.replaceAll("\'","").replaceAll(" ","") + "'";
    }

}
