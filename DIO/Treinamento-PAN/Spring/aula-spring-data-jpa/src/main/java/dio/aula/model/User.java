/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dio.aula.model;
import jakarta.persistence.*;


/**
 *
 * @author alifi
 */
@Entity
public class User {
//criação do ID e realizando o autoicrement
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer id;
	
	@Column(length = 50, nullable = false)
	private String name;
	
	@Column(length = 20, nullable = false)
	private String username;
	
	@Column(length = 100, nullable = false)
	private String password;
	
	@Column(nullable = false)
	private Boolean status;
}
