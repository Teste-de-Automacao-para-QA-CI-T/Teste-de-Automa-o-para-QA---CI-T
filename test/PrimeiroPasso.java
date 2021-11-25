
import java.io.File;
import junit.framework.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Seidor
 */
public class PrimeiroPasso extends TestCase {

    public void teste() {

        String question = "Science: Computers"; // Variável para pesquisa 

        File file = new File("C:\\Users\\Seidor\\Desktop\\Projetos java\\chromedriver.exe"); //Coloque o caminho para o seu chromedrive
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath()); //Especifica o driver de navegação
        WebDriver driver = new ChromeDriver(); //Iniciando driver de navegação
        driver.get("https://opentdb.com/browse.php");// Link para busca 

        driver.findElement(By.id("query")).sendKeys(question);//Selecionar a label de pesquisa pelo ID e preenche ela
        driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[1]/form/div/button")).click();//Selecionar botão pelo caminho xpath

        String texto = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[2]/div")).getText(); // Pega o resultado da pesquisa e coloca em uma string
        assertEquals(texto, "No questions found."); // Compara o resultado obtido com o resultado esperado
        driver.close();//Fechar o driver após a execução das atividades
 
    }

}
