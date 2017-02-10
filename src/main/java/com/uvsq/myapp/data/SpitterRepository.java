package com.uvsq.myapp.data;

import com.uvsq.myapp.Spitter;

public interface SpitterRepository {

  Spitter save(Spitter spitter);
  
  Spitter findByUsername(String username);

}
