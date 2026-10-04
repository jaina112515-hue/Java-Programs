/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jaina
 */
public class OnlineExaminationSystem {
   
    static class InvalidStudentIDException extends Exception {
        public InvalidStudentIDException(String message) {
            super(message);
        }
    }

    
    static class InvalidQuestionNumberException extends Exception {
        public InvalidQuestionNumberException(String message) {
            super(message);
        }
    }

   
    static class InvalidAnswerException extends Exception {
        public InvalidAnswerException(String message) {
            super(message);
        }
    }

   
    
    static class ExaminationTimeExpiredException extends Exception {
        public ExaminationTimeExpiredException(String message) {
            super(message);
        }
    }

    
    static class DuplicateSubmissionException extends Exception {
        public DuplicateSubmissionException(String message) {
            super(message);
        }
    }
}    
