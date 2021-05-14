package converter;

import dao.VoivodeshipDao;
import entity.Voivodeship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class StringToVoivodeshipController implements Converter<String, Voivodeship>

    {
        @Autowired(required = false)
        private VoivodeshipDao voivodeshipDao;
        @Override
        public Voivodeship convert(String source) {
        int voivodeshipId = Integer.parseInt(source);
        return voivodeshipDao.findById(voivodeshipId);
    }
}
