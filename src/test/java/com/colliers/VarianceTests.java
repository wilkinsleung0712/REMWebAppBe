package com.colliers;

import com.colliers.common.utils.dao.CustomDaoImpl;
import com.colliers.mri.mapper.GlsumMapper;
import com.colliers.mri.pojo.Glsum;
import com.colliers.mri.pojo.GlsumExample;
import com.colliers.mri.pojo.GlsumExample.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VarianceTests {
    @Autowired
    private GlsumMapper glsumMapper;

    @Autowired
    private CustomDaoImpl customDao;

    public VarianceTests() {
    }

    @Test
    public void GetAllGlsumTests() throws Exception {
        GlsumExample glsumExample = new GlsumExample();
        Criteria criteria = glsumExample.createCriteria();
        criteria.andAcctnumBetween("CI200100","CI220000").andEntityidEqualTo("201122").andBasisEqualTo("A").andPeriodEqualTo("201405");
        glsumExample.setDistinct(true);
        List<Glsum> glsums = this.glsumMapper.selectByExample(glsumExample);
        System.out.println(glsums.size());
        Assert.assertFalse(glsums.isEmpty());
    }

    @Test
    public void CustomDaoTests() throws Exception {
        List<String> dataList = this.customDao.selectVarienceAccountCodeList("201122", "A", "201405", "200100", "220000");
        Assert.assertFalse(dataList.isEmpty());
    }
}
