package controller; // تأكدي أن اسم المجلد controller بحرف صغير

import model.Annotation;      // استدعاء الموديل الصحيح (models)
import view.AnnotationView;    // استدعاء طبقة العرض
import services.AnnotationService; // استدعاء طبقة الخدمات

public class AnnotationController {
    private final AnnotationView view;
    private final AnnotationService service;

    public AnnotationController(AnnotationView view, AnnotationService service) {
        this.view = view;
        this.service = service;
    }

    public void addNewAnnotation(int id, String text, int time) {
        try {
            // إنشاء كائن من الموديل الذي أرسلتِه
            Annotation newNote = new Annotation(id, text, time);
            
            // تنفيذ الحفظ عبر الخدمة
            service.processAndSave(newNote);
            
            // عرض النتيجة في الواجهة
            view.showAnnotation(newNote);
            view.displayMessage("Operation successful!");
            
        } catch (Exception e) {
            view.displayMessage("Error: " + e.getMessage());
        }
    }

    public void renderFullTimeline() {
        // عرض جميع الملاحظات المخزنة
        view.showAll(service.getAllAnnotations());
    }
}
