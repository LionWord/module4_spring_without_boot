package ru.practicum.item;

import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
public class ItemServiceImpl {

    private final ItemRepository repository;

    List<Item> getItems(Long userId) {
        return repository.findById();
    };
    Item addNewItem(Long userId, Item item) {
        return repository.save(item);
    };
    void deleteItem(Long userId, Long itemId) {
        repository.delete();
    };
}
