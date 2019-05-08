package application;


import backup.repo.BackupRepo;
import backup.service.BackupService;

public class ZipFactory {

    private BackupService backupService = new BackupService(new BackupRepo());

    ZipFactory() {
        new StorageInitializer();
        backupService.compressBackup();
    }

}
