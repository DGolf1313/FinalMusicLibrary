package com.promineotech.music.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import com.promineotech.music.entity.Musician;

public class DefaultCreateMusicianDao implements CreateMusicianDao {


  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;
  
  @Override
  public void saveMusician(Musician musician) {
    
    String sql = ""
        +"INSERT INTO musician ("
        +"first_name, last_name, alias_name"
        +") VALUES ("
        +":first_name, :last_name, alias_name"
        +")";
    
    Map<String, Object> params = new HashMap<>();
    params.put("first_name", musician.getFirstName());
    params.put("last_name", musician.getLastName());
    params.put("alias_name", musician.getAliasName());
    
    jdbcTemplate.update(sql, params);
    
  }

  @Override
  public Optional<Musician> fetchMusician(String firstName, String lastName, String aliasName) {
    // TODO Auto-generated method stub
    return Optional.empty();
  }
}
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
