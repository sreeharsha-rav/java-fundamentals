package com.test;
import com.medicine.Medicine;
import com.medicine.Ointment;
import com.medicine.Syrup;
import com.medicine.Tablet;

public class TestMedicine {
    public static void main(String[] args) {
        Medicine[] medicines = new Medicine[5];
        medicines[0] = new Tablet(100, "12/12/2022", "Paracetamol", "Cipla");
        medicines[1] = new Syrup(200, "12/12/2022", "Benadryl", "Cipla");
        medicines[2] = new Ointment(300, "12/12/2022", "Soframycin", "Cipla");
        medicines[3] = new Tablet(400, "12/12/2022", "Crocin", "Cipla");
        medicines[4] = new Syrup(500, "12/12/2022", "Ascoril", "Cipla");

        for (Medicine medicine : medicines) {
            System.out.println("=====================================");
            medicine.displayLabel();
            medicine.getDetails();
        }
    }
}
