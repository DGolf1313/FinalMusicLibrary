package com.promineotech.music.dao;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import com.promineotech.music.entity.Musician;
import com.promineotech.music.entity.MusicianRequest;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DefaultCreateMusicianDao implements CreateMusicianDao {


  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;
  
  @Override
  public Musician saveMusician(MusicianRequest musician) {
  log.debug("DAO: musician={}");
    
    String sql = ""
        +"INSERT INTO musician ("
        +"first_name, last_name, alias_name"
        +") VALUES ("
        +":first_name, :last_name, alias_name"
        +")";
    
    MapSqlParameterSource parms = new MapSqlParameterSource();
    parms.addValue("first_name", musician.getFirstName());
    parms.addValue("last_name", musician.getLastName());
    parms.addValue("alias_name", musician.getAliasName()); KeyHolder keyHolder = new GeneratedKeyHolder();
    jdbcTemplate.update(sql, parms, keyHolder); 
    // @formatter:off
    return Musician.builder()
        .musicianId(keyHolder.getKey().intValue())
        .firstName(musician.getFirstName())
        .lastName(musician.getLastName())
        .aliasName(musician.getAliasName())
        .build();
    // @formatter:on
   }
}

/*
 * @Override public Optional<Musician> fetchMusician(String firstName, String lastName, String
 * aliasName) { // TODO Auto-generated method stub return Optional.empty(); }
 * 
 * }
 */
//The following is code that I was originally trying, but chose to go a different route.  

/*public Musician saveMusician(String firstName, String lastName, String aliasName) {
SqlParams params = generateInsertSql(firstName, lastName);
return Musician.builder()
    .firstName(firstName)
    .lastName(lastName)
    .aliasName(aliasName)
    .build();
}

private SqlParams generateInsertSql(String firstName, String lastName) {
SqlParams params = new SqlParams();

params.;
return null;
}

*/

//class SqlParams {
  //String sql;
  //MapSqlParameterSource source = new MapSqlParameterSource();

//}

/* Map<String, Object> params = new HashMap<>();
params.put("first_name", musician.getFirstName());
params.put("last_name", musician.getLastName());
params.put("alias_name", musician.getAliasName());

jdbcTemplate.update(sql, params);

}*/
