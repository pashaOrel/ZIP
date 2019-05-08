package application;

import backup.domain.Backup;
import user.Activity;
import user.domain.User;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static storage.Storage.listOfUsers;

public class StorageInitializer {

    public StorageInitializer() {
        storageInitialize();
    }

    private void storageInitialize() {
        listOfUsers = userInitialize();
    }

    private List<User> userInitialize() {

        List<User> users = new ArrayList<>();

        users.add(new User("Kolya", 1L, Activity.INACTIVE, backupInitialize(0)));
        users.add(new User("Vasya", 2L, Activity.INACTIVE, backupInitialize(5)));
        users.add(new User("Petya", 3L, Activity.INACTIVE, backupInitialize(100)));
        users.add(new User("Olya", 4L, Activity.INACTIVE, backupInitialize(40)));
        users.add(new User("Nastya", 5L, Activity.INACTIVE, backupInitialize(20)));

        return users;
    }

    private List<Backup> backupInitialize(int compressionFactor)  {

        List<Backup> userBackups = new ArrayList<>();
        try {
            ClassLoader classLoader = ClassLoader.getSystemClassLoader();

            switch (compressionFactor) {

                case 0: {
                    userBackups.add(new Backup(1L, new File(classLoader.getResource("non_compressible/1.dat").getFile())));
                    userBackups.add(new Backup(2L, new File(classLoader.getResource("non_compressible/2.dat").getFile())));
                    userBackups.add(new Backup(3L, new File(classLoader.getResource("non_compressible/1.dat").getFile())));
                    break;
                }
                case 5: {
                    userBackups.add(new Backup(1L, new File(classLoader.getResource("x5/1.dat").getFile())));
                    userBackups.add(new Backup(2L, new File(classLoader.getResource("x5/2.dat").getFile())));
                    userBackups.add(new Backup(3L, new File(classLoader.getResource("x5/3.dat").getFile())));
                    break;
                }
                case 10: {
                    userBackups.add(new Backup(1L, new File(classLoader.getResource("x10/1.dat").getFile())));
                    userBackups.add(new Backup(2L, new File(classLoader.getResource("x10/2.dat").getFile())));
                    userBackups.add(new Backup(3L, new File(classLoader.getResource("x10/3.dat").getFile())));
                    break;
                }
                case 20: {
                    userBackups.add(new Backup(1L, new File(classLoader.getResource("x20/1.dat").getFile())));
                    userBackups.add(new Backup(2L, new File(classLoader.getResource("x20/2.dat").getFile())));
                    userBackups.add(new Backup(3L, new File(classLoader.getResource("x20/3.dat").getFile())));
                    break;
                }
                case 40: {
                    userBackups.add(new Backup(1L, new File(classLoader.getResource("x40/1.dat").getFile())));
                    userBackups.add(new Backup(2L, new File(classLoader.getResource("x40/2.dat").getFile())));
                    userBackups.add(new Backup(3L, new File(classLoader.getResource("x40/3.dat").getFile())));
                    break;
                }
                case 100: {
                    userBackups.add(new Backup(1L, new File(classLoader.getResource("x100/1.dat").getFile())));
                    userBackups.add(new Backup(2L, new File(classLoader.getResource("x100/2.dat").getFile())));
                    userBackups.add(new Backup(3L, new File(classLoader.getResource("x100/3.dat").getFile())));
                    break;
                }

            }
        }   catch (Exception e) {
            System.out.println("Something wrong with backup initializing");  //remove this. Use logger
            e.printStackTrace();
        }

        return userBackups;
    }
}
