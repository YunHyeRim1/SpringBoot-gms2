package com.example.demo.sym.service;

import com.example.demo.sts.service.Subject;
import lombok.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Getter
@Entity
@ToString
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Table(name="teacherse")
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tea_num") private int teaNum;
	@Column(name = "name") private String name;
	@Column(name = "email") private String email;
	@Column(name = "password") private String password;
	@Column(name = "profile_image") private String profileImage;

	@ManyToOne
	@JoinColumn(name = "sub_num")
	private Subject subject;

	@Builder
	private Teacher(String name, String email, String password, String profileImage) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.profileImage = profileImage;
	}
}
