package user.service;

import user.repo.UserRepo;
import user.domain.User;

import java.util.List;
import java.util.Optional;

public class UserService extends UserRepo {

    private UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void add(User user) {
        userRepo.add(user);
    }

    @Override
    public Optional<User> findUserById(Long id) {
        return userRepo.findUserById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public void printAll() {
        userRepo.printAll();
    }

    @Override
    public void deleteUserById(Long id) {
        super.deleteUserById(id);
    }
}
