public class DayReservation {

    private int dayReservationID;
    private int conferenceDayBookingID;
    private int participantID;
    private int isStudent;
    private String studentCard;
    private String university;

    @Override
    public String toString() {
        return "exec [dbo].[PROC_AddDayReservation] '"  + conferenceDayBookingID +
                "', '" + participantID +  "', '"
                 + isStudent +  "', '"
               + studentCard +  "', '"
              + university + "'";
    }

    public DayReservation(int dayReservationID, int conferenceDayBookingID, int participantID, int isStudent, String studentCard, String university) {
        this.dayReservationID = dayReservationID;
        this.conferenceDayBookingID = conferenceDayBookingID;
        this.participantID = participantID;
        this.isStudent = isStudent;
        this.studentCard = studentCard;
        this.university = university;
    }

    public int getDayReservationID() {
        return dayReservationID;
    }

    public int getConferenceDayBookingID() {
        return conferenceDayBookingID;
    }

    public int getParticipantID() {
        return participantID;
    }

    public int getIsStudent() {
        return isStudent;
    }

    public String getStudentCard() {
        return studentCard;
    }

    public String getUniversity() {
        return university;
    }

    /*CREATE PROCEDURE [dbo].[PROC_AddDayReservation]
            (@ConferenceDayBookingID int,
    @ParticipantID int,
    @IsStudent bit,
    @StudentCard varchar(6),
    @University varchar(255)) */
}
