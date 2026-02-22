package view;

import model.Annotation;
import java.util.List;

public class AnnotationView {
    public void displayHeader() {
        System.out.println("========================================");
        System.out.println("      LectaHub - Feedback Management System");
        System.out.println("========================================");
    }

    public void showAnnotation(Annotation annotation) {
        System.out.println("• New observation : " + annotation.getContent());
        System.out.println("  Video timing : " + annotation.getTimestamp() + " second");
    }

    public void showAll(List<Annotation> list) {
        System.out.println("\n--- List of all notes in this lesson ---");
        for (Annotation a : list) {
            System.out.println(a);
        }
    }

    public void displayMessage(String msg) {
        System.out.println("[System Notice] : " + msg);
    }
}
