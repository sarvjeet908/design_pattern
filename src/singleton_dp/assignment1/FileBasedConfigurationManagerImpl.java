package singleton_dp.assignment1;



public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {

    private static FileBasedConfigurationManagerImpl fileBasedConfigurationManagerImpl=null;

    private FileBasedConfigurationManagerImpl(){

    }
    @Override
    public String getConfiguration(String key) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
        return properties.getProperty(key);
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
        String value =properties.getProperty(key);
        if (value !=null){
             return convert(value,type);
        }
        return null;
    }

    @Override
    public void setConfiguration(String key, String value) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
        properties.setProperty(key,value);
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        // TODO Auto-generated method stub
        if(value != null){
            properties.setProperty(key, value.toString());
        }
        else{
            removeConfiguration(key);
        }
       // throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
    }

    @Override
    public void removeConfiguration(String key) {
        // TODO Auto-generated method stub
        properties.remove(key);
        //throw new UnsupportedOperationException("Unimplemented method 'removeConfiguration'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        properties.clear();
        //throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    public static FileBasedConfigurationManager getInstance() {
        if (fileBasedConfigurationManagerImpl==null){
            synchronized(FileBasedConfigurationManagerImpl.class){
                if (fileBasedConfigurationManagerImpl==null){
                    fileBasedConfigurationManagerImpl=new FileBasedConfigurationManagerImpl();
                }
            }
        }

        return fileBasedConfigurationManagerImpl;
    }

    public static void resetInstance() {
        if (fileBasedConfigurationManagerImpl!=null){
            fileBasedConfigurationManagerImpl=null;
        }
    }

}
