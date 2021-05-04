package gameMaster.Abstract;

import gameMaster.Entities.User;

public interface UserService {
public void add(User[] users);
public void delete(User user);
public void update(User user);
}
