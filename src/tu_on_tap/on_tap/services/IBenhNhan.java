package tu_on_tap.on_tap.services;

import tu_on_tap.on_tap.utils.NotFoundMedicalRecordException;

public interface IBenhNhan {
    void add();
    void delete() throws NotFoundMedicalRecordException;
    void display();
    int id();
}
