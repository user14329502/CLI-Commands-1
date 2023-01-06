package prj.springBootRestApi.CLICommands1.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleSlugService implements SlugService {


    @Override
    public String slugify(String title) {
        return title.
                toLowerCase() // Convert to lowercase
                .replaceAll("[^a-zA-Z0-9 ]", "") // replace all special characters except space
                .replaceAll(" ", "-"); // replace all spaces with hyphens
    }

}
