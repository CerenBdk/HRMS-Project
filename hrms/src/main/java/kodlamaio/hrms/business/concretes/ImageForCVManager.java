package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.Map;

import javax.swing.plaf.multi.MultiInternalFrameUI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Url;

import kodlamaio.hrms.business.abstracts.ImageForCVService;
import kodlamaio.hrms.business.abstracts.JobseekerService;
import kodlamaio.hrms.core.utilities.imageUpload.ImageUploadService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ImageForCVDao;
import kodlamaio.hrms.entities.concretes.ImageForCV;
import kodlamaio.hrms.entities.concretes.Jobseeker;

@Service
public class ImageForCVManager implements ImageForCVService{

	private ImageForCVDao imageForCVDao;
	private ImageUploadService imageUploadService;

	@Autowired
	public ImageForCVManager(ImageForCVDao imageForCVDao, ImageUploadService imageUploadService) {
		super();
		this.imageForCVDao = imageForCVDao;
		this.imageUploadService = imageUploadService;
	}
	
	@Override
	public Result add(ImageForCV imageForCV , MultipartFile imageFile) {
		Map<String,String> uploadImage = this.imageUploadService.uploadImageFile(imageFile).getData();
		imageForCV.setUrl(uploadImage.get("url"));
		this.imageForCVDao.save(imageForCV);
		return new SuccessResult("Image has been added.");
	}

	@Override
	public Result update(ImageForCV imageForCV) {
		this.imageForCVDao.save(imageForCV);
		return new SuccessResult("Image has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.imageForCVDao.deleteById(id);
		return new SuccessResult("Image has been deleted.");
	}

	@Override
	public DataResult<ImageForCV> getById(int id) {
		return new SuccessDataResult<ImageForCV>(this.imageForCVDao.getById(id));
	}

	@Override
	public DataResult<List<ImageForCV>> getAll() {
		return new SuccessDataResult<List<ImageForCV>>(this.imageForCVDao.findAll());
	}

	@Override
	public DataResult<ImageForCV> getByJobseekerId(int id) {
		return new SuccessDataResult<ImageForCV>(this.imageForCVDao.getByJobseeker_id(id));
	}

}
