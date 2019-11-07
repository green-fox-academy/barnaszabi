package com.barnaszabi.reddit.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String url;
  private int points = 0;
  private String date = formatDate();

  private String formatDate() {
    String strDateFormat = "yyyy.MM.dd HH:mm";
    DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
    String formattedDate = dateFormat.format(new Date());
    return formattedDate;
  }
}
