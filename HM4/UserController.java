package lesson4.exercise1;

public interface UserController<T extends User> {
	void create(String surname, String firstname, String patronymic);
}
