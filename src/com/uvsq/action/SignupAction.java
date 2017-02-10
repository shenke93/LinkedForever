package com.uvsq.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.uvsq.domain.City;
import com.uvsq.domain.Country;
import com.uvsq.domain.Province;
import com.uvsq.domain.Student;
import com.uvsq.domain.University;
import com.uvsq.form.SignupForm;
import com.uvsq.idao.ICityDAO;
import com.uvsq.idao.ICountryDAO;
import com.uvsq.idao.IProvinceDAO;
import com.uvsq.idao.IStudentDAO;
import com.uvsq.idao.IUniversityDAO;

public class SignupAction extends DispatchAction 
{
	private ICountryDAO iCountryDAO; 
	private IProvinceDAO iProvinceDAO;
	private ICityDAO iCityDAO;
	private IStudentDAO iStudentDAO;
	private IUniversityDAO iUniversityDAO;

	public void setiCountryDAO(ICountryDAO iCountryDAO) 
	{
		this.iCountryDAO = iCountryDAO;
	}

	public void setiProvinceDAO(IProvinceDAO iProvinceDAO) 
	{
		this.iProvinceDAO = iProvinceDAO;
	}

	public void setiCityDAO(ICityDAO iCityDAO) 
	{
		this.iCityDAO = iCityDAO;
	}

	public void setiStudentDAO(IStudentDAO iStudentDAO) 
	{
		this.iStudentDAO = iStudentDAO;
	}

	public void setiUniversityDAO(IUniversityDAO iUniversityDAO) 
	{	
		this.iUniversityDAO = iUniversityDAO;
	}

	public ActionForward signups1(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) 
	{
		SignupForm signupForm = (SignupForm) form;
		
		if(iStudentDAO.isExist(signupForm.getEmail()))
		{
			request.setAttribute("errInfo", true);
			return mapping.findForward("tosignup");
		}
		else
		{
			Student s = new Student();
			s.setEmail(signupForm.getEmail());
			s.setTel(signupForm.getTel());
			s.setPwd(signupForm.getPassword());
			
			iStudentDAO.add(s);
			request.getSession().setAttribute("stu_id", s.getId());
			
			return mapping.findForward("tosignup2");
		}
	}
	
	public ActionForward signups2(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) 
	{
		SignupForm signupForm = (SignupForm) form;
		int id = (Integer) request.getSession().getAttribute("stu_id");

		if(signupForm.getName().length() != 0)
		{
			Student s = iStudentDAO.getStuById(id);
			s.setName(signupForm.getName());
			s.setSex(signupForm.getSex());
			s.setBirthday(signupForm.getBirthday());
			
			iStudentDAO.update(s);
			
			return mapping.findForward("tosignup3");
		}
		else
		{
			request.setAttribute("errInfo", true);
			return mapping.findForward("tosignup2");
		}
	}
	
	public ActionForward signups3(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) 
	{
		SignupForm signupForm = (SignupForm) form;
		int id = (Integer) request.getSession().getAttribute("stu_id");
		
		Country country = iCountryDAO.getCountryById(Integer.parseInt(signupForm.getCountry()));
		Province province = iProvinceDAO.getProById(Integer.parseInt(signupForm.getProvince()));
		City city = iCityDAO.getCityById(Integer.parseInt(signupForm.getCity()));
		
		Student s = iStudentDAO.getStuById(id);
		s.setHomeCountry(country);
		s.setHomePro(province);
		s.setHomeCity(city);
		
		iStudentDAO.update(s);
		
		return mapping.findForward("tosignup4");
	}
	
	public ActionForward signups4(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) 
	{
		SignupForm signupForm = (SignupForm) form;
		int id = (Integer) request.getSession().getAttribute("stu_id");
		
		University u = iUniversityDAO.getUniById(Integer.parseInt(signupForm.getUniversity()));
		
		Student s = iStudentDAO.getStuById(id);
		s.setUniversity(u);
		
		iStudentDAO.update(s);
		
		request.getSession().setAttribute("userInfo", s);
		return mapping.findForward("tohomepage");
	}
	
	public ActionForward returnWelcome(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) 
	{
		int id = (Integer) request.getSession().getAttribute("stu_id");
		iStudentDAO.delete(Student.class, id);
		request.getSession().invalidate();
		return mapping.findForward("towelcome");
	}
}