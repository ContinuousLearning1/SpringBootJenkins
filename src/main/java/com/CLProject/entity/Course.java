package com.CLProject.entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
public class Course {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false)
	    private String title;

	    @Column(nullable = false, length = 2000)
	    private String description;

	    @Lob
	    private String coverImage; // Base64 encoded image string

	   
	    @ManyToOne
	    @JoinColumn(name = "ids", nullable = false)
	    private User user;

	    private Double enrollmentFee;

	    @Column(nullable = false)
	    private LocalDate enrollmentStartDate;

	    @Column(nullable = false)
	    private LocalDate enrollmentEndDate;

	    @Column(nullable = false)
	    private LocalDate courseStartDate;

	    @Column(nullable = false)
	    private LocalDate courseEndDate;

	    private String totalDuration;

	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCoverImage() {
			return coverImage;
		}

		public void setCoverImage(String coverImage) {
			this.coverImage = coverImage;
		}

		public User getInstructor() {
			return user;
		}

		public void setInstructor(User instructor) {
			this.user = instructor;
		}

		public Double getEnrollmentFee() {
			return enrollmentFee;
		}

		public void setEnrollmentFee(Double enrollmentFee) {
			this.enrollmentFee = enrollmentFee;
		}

		public LocalDate getEnrollmentStartDate() {
			return enrollmentStartDate;
		}

		public void setEnrollmentStartDate(LocalDate enrollmentStartDate) {
			this.enrollmentStartDate = enrollmentStartDate;
		}

		public LocalDate getEnrollmentEndDate() {
			return enrollmentEndDate;
		}

		public void setEnrollmentEndDate(LocalDate enrollmentEndDate) {
			this.enrollmentEndDate = enrollmentEndDate;
		}

		public LocalDate getCourseStartDate() {
			return courseStartDate;
		}

		public void setCourseStartDate(LocalDate courseStartDate) {
			this.courseStartDate = courseStartDate;
		}

		public LocalDate getCourseEndDate() {
			return courseEndDate;
		}

		public void setCourseEndDate(LocalDate courseEndDate) {
			this.courseEndDate = courseEndDate;
		}

		public String getTotalDuration() {
			return totalDuration;
		}

		public void setTotalDuration(String totalDuration) {
			this.totalDuration = totalDuration;
		}

		public String getPrerequisites() {
			return prerequisites;
		}

		public void setPrerequisites(String prerequisites) {
			this.prerequisites = prerequisites;
		}

		private String prerequisites;
}
