import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;

class Gigasecond {

	LocalDateTime date;
	Duration GIGA_SECOND = Duration.ofSeconds(1_000_000_000);

    Gigasecond(LocalDate birthDate) {
        date = birthDate.atStartOfDay().plus(GIGA_SECOND);
    }

    Gigasecond(LocalDateTime birthDateTime) {
    	date = birthDateTime.plus(GIGA_SECOND);
    }

    LocalDateTime getDateTime() {
        return date;
    }

}
