package ch08.ex03.case01;

import java.time.LocalDate;
import java.util.Objects;

public record Book(String title, int price, LocalDate printedDate) {
	public Book { // null 값을 주기 싫다?
		Objects.requireNonNull(title);
		Objects.requireNonNull(printedDate);
	}
}
