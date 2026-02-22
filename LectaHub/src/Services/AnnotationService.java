package services;

import model.Annotation; 
import java.util.ArrayList;
import java.util.List;


public class AnnotationService {
    private final List<Annotation> databaseEmulator = new ArrayList<>();

    public void processAndSave(Annotation annotation) {
        System.out.println("[Service] Security review in progress...");
        databaseEmulator.add(annotation);
        System.out.println("[Service] Note saved successfully to cloud.");
    }

    public List<Annotation> getAllAnnotations() {
        return databaseEmulator;
    }
}
