package thi_that.service;
import thi_that.utils.NotFoundStudentException;
public interface ILopHoc {
    void them();
    void xoa() throws NotFoundStudentException;
    void xem();
}
