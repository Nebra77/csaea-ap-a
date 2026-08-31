
def get_animals(name):
    animals = ["cat", "dog", "blobfish", "shark", "owl", "toad"]
    for animal in animals:
        if animal == name:
            return f"{name} is an animal."
    return f"{name} is not an animal."
print(get_animals("cat"))