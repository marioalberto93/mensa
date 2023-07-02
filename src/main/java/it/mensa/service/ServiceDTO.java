package it.mensa.service;

public interface ServiceDTO<DTO> {

    public DTO read(long id);
    public DTO insert(DTO dto);
    public DTO update(DTO dto);
    public void delete(long id);
    public Iterable<DTO> getAll();
}
