package javaBasics.intro.oop.abstraction;

public class UserService extends AbstractService<User>{

	@Override
	User getInstance(Object o) {
		return new User();
	}

}
