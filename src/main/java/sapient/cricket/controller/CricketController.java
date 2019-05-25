package sapient.cricket.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sapient.cricket.response.Match;
import sapient.cricket.response.SapientCricketResponse;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@RestController
public class CricketController {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @RequestMapping("/getScore")
    public ResponseEntity<SapientCricketResponse> getScore() {
        SapientCricketResponse response = mapCricResponseToSapientCricketResponse();
        return ResponseEntity.ok(response);
    }

    private Match mapJsonToPojo() {
        Match cricScoreResponse = null;
        try {
            File file = ResourceUtils.getFile("classpath:Mock.json");
            String content = new String(Files.readAllBytes(file.toPath()));
            cricScoreResponse = OBJECT_MAPPER.readValue(content, Match.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cricScoreResponse;
    }

    private SapientCricketResponse mapCricResponseToSapientCricketResponse() {
        Match cricScoreResponse = mapJsonToPojo();
        SapientCricketResponse sapientCricketResponse = new SapientCricketResponse();
        sapientCricketResponse.setMatchUniqueId(cricScoreResponse.getUnique_id());
        sapientCricketResponse.setTeam1(cricScoreResponse.getTeam1());
        sapientCricketResponse.setTeam2(cricScoreResponse.getTeam2());
        sapientCricketResponse.setTeamScore(cricScoreResponse.getTeamScore());
        sapientCricketResponse.setRoundRotation(cricScoreResponse.getRoundRotation());
        return sapientCricketResponse;
    }

}
