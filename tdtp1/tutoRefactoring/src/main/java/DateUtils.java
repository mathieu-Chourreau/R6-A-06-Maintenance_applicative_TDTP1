import java.time.LocalDate;

public class DateUtils {
    /**
     * azertyui
     * @param startingDate
     * @param endingDate
     * @return
     */

    @SuppressWarnings("checkstyle:LineLength")
    public static boolean isNowBetween(final LocalDate startingDate, final LocalDate endingDate) {
        final LocalDate now = LocalDate.now();
        return now.isAfter(startingDate)
                &&
                now.isBefore(endingDate);
    }

}