package com.sample.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class System {

	        private String fname;
        private String lname;
        private String age;
/*      private Date lastaudit;
        public Date getLastaudit() {
                return lastaudit;
        }
        public void setLastaudit(Date lastaudit) {
                this.lastaudit = lastaudit;
        }*/
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name="id")
        private long id;
        public long getId() {
                return id;
        }
        public void setId(long id) {
                this.id = id;
        }
        public String getlName() {
                return lname;
        }
        public void setlName(String lname) {
                this.lname = lname;
        }
        public String getfName() {
                return fname;
        }
        public void setfName(String fname) {
                this.fname = fname;
        }
        public String getAge() {
                return age;
        }
        public void setAge(String age) {
                this.age = age;
        }

        public String toString(){
                return id+" | " + fname+ " | " + lname + " | " +age;
        }
	
}
