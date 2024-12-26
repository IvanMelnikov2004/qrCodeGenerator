package id.my.hendisantika.qrcodegenerator.model;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;


@Getter
@Setter
@Validated
public class QrCodeEmail {

    @NotEmpty
    private String emailToBeEncoded = "";

    private String subjectToBeEncoded = "";

    public QrCodeEmail() {
    }

    public QrCodeEmail(@NotEmpty String emailToBeEncoded) {
        this.emailToBeEncoded = emailToBeEncoded;
    }

    public QrCodeEmail(String emailToBeEncoded, String subjectToBeEncoded) {
        this.emailToBeEncoded = emailToBeEncoded;
        this.subjectToBeEncoded = subjectToBeEncoded;
    }
}
