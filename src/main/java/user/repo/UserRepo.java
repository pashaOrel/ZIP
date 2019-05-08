package user.repo;

import user.domain.User;

import java.util.List;
import java.util.Optional;

import static storage.Storage.listOfUsers;

public class UserRepo {

    public void add(User user) {
        listOfUsers.add(user);
    }

    public Optional<User> findUserById(Long id) {
        return findById(id);
    }

    private Optional<User> findById(Long id) {
        return listOfUsers.stream().filter(user -> Long.valueOf(id).equals(user.getId())).findAny();
    }

    public List<User> findAll() {
        return listOfUsers;
    }

    public void printAll() {
        listOfUsers.forEach(System.out::println);
    }

    public void deleteUserById( Long id) {
        Optional<User> user = findUserById(id);
        if (user != null) {
            listOfUsers.remove(user);
        }
    }
}
