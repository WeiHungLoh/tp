package seedu.address.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import seedu.address.model.student.Student;


/**
 * An UI component that displays information of a {@code Person}.
 */
public class StudentFindWindowCard extends UiPart<Region> {

    private static final String FXML = "StudentListFindCard.fxml";

    /**
     * Note: Certain keywords such as "location" and "resources" are reserved keywords in JavaFX.
     * As a consequence, UI elements' variable names cannot be set to such keywords
     * or an exception will be thrown by JavaFX during runtime.
     *
     * @see <a href="https://github.com/se-edu/addressbook-level4/issues/336">The issue on AddressBook level 4</a>
     */

    public final Student student;

    @FXML
    private HBox cardPane;
    @FXML
    private Label name;
    @FXML
    private Label parentName;
    @FXML
    private Label studentId;
    @FXML
    private Label id;
    @FXML
    private Label phone;
    @FXML
    private Label address;
    @FXML
    private Label email;
    @FXML
    private Circle attendanceIcon;

    /**
     * Creates a {@code PersonCode} with the given {@code Person} and index to display.
     */
    public StudentFindWindowCard(Student student, int displayedIndex) {
        super(FXML);
        this.student = student;
        id.setText(displayedIndex + ". ");
        name.setText(student.getStudentName().fullName);
        parentName.setText(student.getParentName().fullName);
        studentId.setText(student.getStudentId().studentId);
        phone.setText(student.getPhone().value);
        address.setText(student.getAddress().value);
        email.setText(student.getEmail().value);
        attendanceIcon.setFill(student.getIsPresentToday() ? Color.PALEGREEN : Color.LIGHTGRAY);
    }
}
