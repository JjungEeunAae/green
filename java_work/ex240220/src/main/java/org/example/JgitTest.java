package org.example;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;

import java.io.File;
import java.io.IOException;

public class JgitTest {
    public static void main(String[] args) {
        /*// Git 저장소 디렉토리
        String repositoryDirectory = "https://github.com/JjungEeunAae/green.git";

        // 파일 경로
        String filePath = "https://github.com/JjungEeunAae/green/tree/main/html_work";

        // Git 저장소 열기
        try (Repository repository = openRepository(repositoryDirectory)) {
            // 파일 내용 읽기
            String fileContent = readFile(repository, filePath);
            System.out.println("File Content:");
            System.out.println(fileContent);
        } catch (IOException | GitAPIException e) {
            e.printStackTrace();
        }*/
    }

    /*private static Repository openRepository(String repositoryDirectory) throws IOException {
        FileRepositoryBuilder repositoryBuilder = new FileRepositoryBuilder();
        return repositoryBuilder
                .setGitDir(new File(repositoryDirectory + "/.git"))
                .readEnvironment() // 컨피규레이션 설정
                .findGitDir() // .git 디렉토리를 찾기 위해 노력
                .build();
    }

    private static String readFile(Repository repository, String filePath) throws GitAPIException {
        String s = null;
        try (Git git = new Git(repository)) {
             s = new String(git
                    .getRepository()
                     .open()
                    .getBytes());
            return s;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return s;
    }*/

}
