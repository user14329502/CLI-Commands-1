// package prj.springBootRestApi.CLICommands1.repository;
//import prj.springbootrestapi1.demo.service.SimpleSlugService;
//import prj.springbootrestapi1.demo.service.SlugService;
//
//import org.springframework.stereotype.Repository;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//@Repository
//public class ArticleRepository0 {
//
//    private final SlugService slugService;  // "SlugService" is an interface
//    private List<Article> articles = new ArrayList<>();
//
//    public ArticleRepository0(SimpleSlugService slugService) {
//        this.slugService = slugService;
//        Map<Integer, String> articles = Map.of(
//                1, "Hello, World!",
//                2, "Spring Initializr",
//                3, "Spring Dependency Injection"
//        );
//        for (Map.Entry<Integer, String> entry : articles.entrySet()) {
//            this.articles.add(new Article(
//                    entry.getKey(),
//                    entry.getValue(),
//                    slugService.slugify(entry.getValue()),
//                    "TEST CONTENT",
//                    LocalDateTime.now()
//            ));
//        }
//    }
//
////    public ArticleRepository(@Qualifier("advancedSlugService") SlugService slugService) {
//
//
//    @GetMapping
//    public List<Article> findAll() {
//        return articles;
//    }
//
//    @GetMapping("/{id}")
//    public Article findById(@PathVariable Integer id) {
//        return articles.stream().filter(a -> a.id().equals(id)).findFirst().orElse(null);
//    }
//
//}

