
package lectahub;

import view.AnnotationView;
import services.AnnotationService;
import controller.AnnotationController;

public class LectaHub {
    
    public static void main(String[] args) {
        // تهيئة النظام
        AnnotationView view = new AnnotationView();
        AnnotationService service = new AnnotationService();
        AnnotationController controller = new AnnotationController(view, service);

        // تشغيل واجهة النظام
        view.displayHeader();
        
        // إضافة ملاحظات تجريبية
        controller.addNewAnnotation(101, "A great explanation of the point of inheritance", 45);
        controller.addNewAnnotation(102, "An important question: Is it possible to have multiple interfaces?", 120);

        // عرض الجدول الزمني للملاحظات
        controller.renderFullTimeline();
    }
}
