package operators.logicalOperators;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean isInterviewQuestionsSent = true;
        boolean isJavaHomeworkSent = true;

        // Send me InterviewQuestions OR JavaHomework
        System.out.println("The student is okay (OR): " +
                (isInterviewQuestionsSent || isJavaHomeworkSent));
        // if there is a single TRUE for OR it is TRUE


        //Send me InterviewQuestions AND JavaHomework
        System.out.println("The student is okay (AND): " +
                (isInterviewQuestionsSent && isJavaHomeworkSent));
        // if there is a single FALSE for AND it is FALSE

        System.out.println("\nThe student did  NOT send the homework " + !isInterviewQuestionsSent);

    }
}
